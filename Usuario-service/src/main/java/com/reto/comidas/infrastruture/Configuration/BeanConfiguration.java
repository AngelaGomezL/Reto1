package com.reto.comidas.infrastruture.Configuration;

import com.reto.comidas.application.handler.IUsuariosHandler;
import com.reto.comidas.domain.api.IUsuarioServicePort;
import com.reto.comidas.domain.spi.IUsuarioPersistencePort;
import com.reto.comidas.domain.usecase.UsuarioUseCase;
import com.reto.comidas.infrastruture.output.mapper.IUsuarioEntityMapper;
import com.reto.comidas.infrastruture.output.adapter.UsuarioJpaAdapter;
import com.reto.comidas.infrastruture.output.repository.IUsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IUsuarioRepository usuarioRepository;
    private final IUsuarioEntityMapper usuarioEntityMapper;


    @Bean
    public IUsuarioPersistencePort usuarioPersistencePort(){
        return new UsuarioJpaAdapter(usuarioRepository, usuarioEntityMapper);
    }
    @Bean
    public IUsuarioServicePort usuarioServicePort(){
        return new UsuarioUseCase(usuarioPersistencePort());
    }





}
