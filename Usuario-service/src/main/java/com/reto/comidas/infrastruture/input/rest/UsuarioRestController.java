package com.reto.comidas.infrastruture.input.rest;

import com.reto.comidas.application.dto.UsuariosRequest;
import com.reto.comidas.application.handler.IUsuariosHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsuarioRestController {
    private final IUsuariosHandler usuariosHandler;


    @GetMapping(value = "/Plazoleta")
    public ResponseEntity<String> administrarPlazoleta(){
        HttpClient plazoleta = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:8080/restaurante")).POST(HttpRequest.BodyPublishers.ofString("{\"action\":\"hello\"}"))
                .build();
        return new ResponseEntity<>("hello World",HttpStatus.OK);
    }



    @PostMapping("/")
    public ResponseEntity<Void> saveUsuario(@RequestBody UsuariosRequest usuariosRequest){
        usuariosHandler.saveUsuario(usuariosRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
