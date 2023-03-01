package com.reto.comidas.infrastruture.Configuration;

import com.reto.comidas.application.handler.IUsuariosHandler;
import com.reto.comidas.domain.api.IUsuarioServicePort;
import com.reto.comidas.domain.spi.IRolePersistencePort;
import com.reto.comidas.domain.spi.IUsuarioPersistencePort;
import com.reto.comidas.domain.usecase.UsuarioUseCase;
import com.reto.comidas.infrastruture.output.adapter.RoleJpaAdapter;
import com.reto.comidas.infrastruture.output.entity.RoleEntity;
import com.reto.comidas.infrastruture.output.entity.UsuarioEntity;
import com.reto.comidas.infrastruture.output.mapper.IRoleEntityMapper;
import com.reto.comidas.infrastruture.output.mapper.IUsuarioEntityMapper;
import com.reto.comidas.infrastruture.output.adapter.UsuarioJpaAdapter;
import com.reto.comidas.infrastruture.output.repository.IRoleRepository;
import com.reto.comidas.infrastruture.output.repository.IUsuarioRepository;
import com.reto.comidas.infrastruture.security.aut.DetailsUser;
import com.reto.comidas.infrastruture.security.aut.IUserDetailsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IUsuarioRepository usuarioRepository;
    private final IUsuarioEntityMapper usuarioEntityMapper;
    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleMapper;
    private final IUserDetailsMapper userDetailsMapper;


    @Bean
    public IUsuarioPersistencePort usuarioPersistencePort(){
        return new UsuarioJpaAdapter(usuarioRepository, usuarioEntityMapper);
    }
    @Bean
    public IUsuarioServicePort usuarioServicePort(){
        return new UsuarioUseCase(usuarioPersistencePort(),rolePersistencePort());
    }
    @Bean
    public IRolePersistencePort rolePersistencePort(){
        return new RoleJpaAdapter(roleRepository, roleMapper);
    }
    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {

        return username -> optionalDetailsUser(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
    private Optional<DetailsUser> optionalDetailsUser(String username) {
        Optional<UsuarioEntity> userEntity = usuarioRepository.findByEmail(username);
        if(userEntity.isEmpty()){
            throw new RuntimeException();
        }
        DetailsUser user = userDetailsMapper.toUser(userEntity.get());
        user.setRole(userEntity.get().getRole().getNombre());
        return Optional.of(user);
    }
    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(encoder());
        return authProvider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }






}
