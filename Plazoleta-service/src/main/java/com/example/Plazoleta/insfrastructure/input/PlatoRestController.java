package com.example.Plazoleta.insfrastructure.input;

import com.example.Plazoleta.application.dto.Plato.PlatoRequest;
import com.example.Plazoleta.application.dto.Plato.PlatoUpdateRequest;
import com.example.Plazoleta.application.handler.handlerPlato.IPlatoHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @PutMapping("/")
    public ResponseEntity<Void> updatePlateEntity(@RequestBody @Valid PlatoUpdateRequest platoRequest){
        var platoOriginal = platoHandler.findById(platoRequest.getId());
        platoHandler.savePlato2(platoOriginal);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
