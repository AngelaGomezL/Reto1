package com.reto.comidas.infrastruture.auth;

import com.reto.comidas.infrastruture.output.entity.UsuarioEntity;
import com.reto.comidas.infrastruture.output.repository.IRoleRepository;
import com.reto.comidas.infrastruture.output.repository.IUsuarioRepository;
import com.reto.comidas.infrastruture.security.JwtService;
import com.reto.comidas.infrastruture.security.aut.DetailsUser;
import com.reto.comidas.infrastruture.security.aut.IUserDetailsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final IUsuarioRepository repository;
    private final IUserDetailsMapper userDetailsMapper;
    private final IRoleRepository rolRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;


    public AuthenticationResponse  authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = optionalDetailsUser(request.getEmail()).get();

        var jwtToken = jwtService.generateToken(user, user.getRole());
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    private Optional<DetailsUser> optionalDetailsUser(String username) {
        Optional<UsuarioEntity> userEntity = repository.findByEmail(username);
        if(userEntity.isEmpty()){
            throw new RuntimeException();
        }
        DetailsUser user = userDetailsMapper.toUser(userEntity.get());
        user.setRole(userEntity.get().getRole().getNombre());
        return Optional.of(user);
    }


    public UserAuthDto getUserAuth(String email) {
        Optional<UsuarioEntity> userEntity = repository.findByEmail(email);
        if(userEntity.isEmpty()){
            throw new RuntimeException();
        }
        DetailsUser user = userDetailsMapper.toUser(userEntity.get());
        user.setRole(userEntity.get().getRole().getNombre());

        return userDetailsMapper.toUserAuth(user);
    }
}