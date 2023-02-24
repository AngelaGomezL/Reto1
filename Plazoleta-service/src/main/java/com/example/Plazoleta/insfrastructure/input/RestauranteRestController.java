package com.example.Plazoleta.insfrastructure.input;

import com.example.Plazoleta.application.dto.request.RestauranteRequest;
import com.example.Plazoleta.application.handler.IRestaurantesHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/plazoleta/")
@RestController
@RequiredArgsConstructor
public class RestauranteRestController {
    private final IRestaurantesHandler restauranteHandler;

    @PostMapping("/restaurante")
    public  ResponseEntity<RestauranteRequest> saveRestaurante(@RequestBody RestauranteRequest restauranteRequest){
        System.out.println(restauranteHandler);
        restauranteHandler.saveRestaurante(restauranteRequest);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(restauranteRequest);
    }


    

}
