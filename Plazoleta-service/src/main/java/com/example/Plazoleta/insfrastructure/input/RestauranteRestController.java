package com.example.Plazoleta.insfrastructure.input;

import com.example.Plazoleta.application.dto.Restaurante.RestauranteListRequest;
import com.example.Plazoleta.application.dto.Restaurante.RestauranteRequest;
import com.example.Plazoleta.application.handler.handlerRestaurante.IRestaurantesHandler;
import com.example.Plazoleta.domain.modelo.Restaurante;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/plazoleta")
public class RestauranteRestController {
    private final IRestaurantesHandler restauranteHandler;

    @PostMapping("/restaurante")
    public  ResponseEntity<RestauranteRequest> saveRestaurante(@RequestBody RestauranteRequest restauranteRequest){
        restauranteHandler.saveRestaurante(restauranteRequest);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(restauranteRequest);
    }

    @GetMapping("/restaurante")
    public  ResponseEntity<List<Restaurante>> findAll(@RequestBody RestauranteListRequest pagination){
        var result = restauranteHandler.findAll(pagination);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }


}
