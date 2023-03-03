package com.reto.comidas.infrastruture.RestaurateClientFeign.RestauranteClient;

import com.reto.comidas.application.dto.PlatoRequest;
import com.reto.comidas.application.dto.PlatoUpdateRequest;
import com.reto.comidas.application.dto.RestauranteRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@FeignClient(name="plazoleta-service",url = "http://localhost:8081" )
public interface RestauranteClient {
    //@PostMapping("/restaurante")
    @RequestMapping(method = RequestMethod.POST, value = "/plazoleta/restaurante")
    public ResponseEntity<RestauranteRequest> saveRestaurante(@RequestBody RestauranteRequest restauranteRequest);
    @RequestMapping(method = RequestMethod.POST, value = "/platos/")
    public ResponseEntity<PlatoRequest> savePlateEntity(@RequestBody PlatoRequest platoRequest);
    @PutMapping("/platos/modificar")
    public ResponseEntity<Void> updatePlateEntity(@RequestBody @Valid PlatoUpdateRequest platoRequest);


}
