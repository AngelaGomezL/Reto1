package com.reto.comidas.infrastruture.input.rest;

import com.reto.comidas.application.dto.RestauranteRequest;
import com.reto.comidas.application.dto.UsuariosRequest;
import com.reto.comidas.application.handler.IUsuariosHandler;
import com.reto.comidas.infrastruture.RestaurateClientFeign.RestauranteClient.RestauranteClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/usuario")
@RequiredArgsConstructor
public class UsuarioRestController {
    private final IUsuariosHandler usuariosHandler;
    @Autowired
    private  RestauranteClient restauranteClient;

    @PostMapping("/propietario")
    public ResponseEntity<Void> savePropietario(@Validated @RequestBody UsuariosRequest usuarioRequest){
            usuariosHandler.saveUsuario(usuarioRequest, 1);
            return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/empleado")
    public ResponseEntity<Void> saveEmpleado(@Validated @RequestBody UsuariosRequest usuarioRequest){
        usuariosHandler.saveUsuario(usuarioRequest, 2);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/usuario")
    public ResponseEntity<Void> saveUsuario(@Validated @RequestBody UsuariosRequest usuarioRequest){
        usuariosHandler.saveUsuario(usuarioRequest, 3);
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
