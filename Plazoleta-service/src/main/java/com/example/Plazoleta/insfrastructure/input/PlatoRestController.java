package com.example.Plazoleta.insfrastructure.input;

import com.example.Plazoleta.application.dto.Plato.PlatoListResquest;
import com.example.Plazoleta.application.dto.Plato.PlatoRequest;
import com.example.Plazoleta.application.dto.Plato.PlatoUpdateRequest;
import com.example.Plazoleta.application.dto.Restaurante.RestauranteListRequest;
import com.example.Plazoleta.application.handler.handlerPlato.IPlatoHandler;
import com.example.Plazoleta.domain.modelo.Plato;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
    @PutMapping("/modificar")
    public ResponseEntity<Void> updatePlateEntity(@RequestBody @Valid PlatoUpdateRequest platoRequest){
        var platoOriginal = platoHandler.findById(platoRequest.getId());
        platoHandler.savePlato2(platoOriginal.toBuilder().idCategoria(platoRequest.getIdCategoria())
                        .precio(platoRequest.getPrecio())
                .build());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping("/platos")
    public  ResponseEntity<List<Plato>> findAllByRestaurante(@RequestBody PlatoListResquest pagination){
        var result = platoHandler.findAllByIdRestaurante(pagination);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }
    @PutMapping("/habilitar/deshabilitar")
    public ResponseEntity<Void> disablePlato(@RequestBody @Valid PlatoUpdateRequest platoRequest){
        var platoOriginal = platoHandler.findById(platoRequest.getId());
        platoHandler.savePlato2(platoOriginal.toBuilder().idCategoria(platoRequest.getIdCategoria())
                .precio(platoRequest.getPrecio())
                .build());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
