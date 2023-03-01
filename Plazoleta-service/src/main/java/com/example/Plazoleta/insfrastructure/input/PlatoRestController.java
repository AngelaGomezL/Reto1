package com.example.Plazoleta.insfrastructure.input;

import com.example.Plazoleta.application.dto.Plato.PlatoRequest;
import com.example.Plazoleta.application.handler.handlerPlato.IPlatoHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/platos")
@RequiredArgsConstructor
public class PlatoRestController {

    private final IPlatoHandler platoHandler;

    @PostMapping("/")
    public ResponseEntity<Void> savePlateEntity(@RequestBody PlatoRequest platoRequest){
        platoHandler.savePlato(platoRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
