package com.reto.comidas.infrastruture.RestaurateClientFeign.RestauranteClient;

import com.reto.comidas.application.dto.RestauranteRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="plazoleta-service",url = "http://localhost:8080" )
public interface RestauranteClient {
    //@PostMapping("/restaurante")
    @RequestMapping(method = RequestMethod.POST, value = "/plazoleta/restaurante")
    public ResponseEntity<RestauranteRequest> saveRestaurante(@RequestBody RestauranteRequest restauranteRequest);


}
