package com.reto.comidas.infrastruture.input.rest;

import com.reto.comidas.application.dto.RestauranteRequest;
import com.reto.comidas.application.dto.UsuariosRequest;
import com.reto.comidas.application.handler.IUsuariosHandler;
import com.reto.comidas.infrastruture.RestaurateClientFeign.RestauranteClient.RestauranteClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsuarioRestController {
    private final IUsuariosHandler usuariosHandler;
    @Autowired
    private  RestauranteClient restauranteClient;

    @PostMapping("/")
    public ResponseEntity<Void> saveUsuario(@RequestBody UsuariosRequest usuariosRequest){
        usuariosHandler.saveUsuario(usuariosRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PostMapping("/restaurante")
    public  ResponseEntity<RestauranteRequest> saveRestaurante(@RequestBody RestauranteRequest restauranteRequest){
        RestauranteRequest restaurante = restauranteClient.saveRestaurante(restauranteRequest).getBody();

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(restauranteRequest);
    }

}
