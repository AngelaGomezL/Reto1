package com.example.Plazoleta.insfrastructure.output.adapter;

import com.example.Plazoleta.application.dto.Restaurante.RestauranteListRequest;
import com.example.Plazoleta.domain.modelo.Restaurante;
import com.example.Plazoleta.domain.spi.IRestaurantePersistencePort;
import com.example.Plazoleta.insfrastructure.output.mapper.IRestauranteEntityMapper;
import com.example.Plazoleta.insfrastructure.output.repository.IRestauranteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class RestauranteJpaAdapter implements IRestaurantePersistencePort {

    private final IRestauranteRepository restauranteRepository;

    private final IRestauranteEntityMapper restauranteEntityMapper;

    public void saveRestaurante(Restaurante restaurante) {
        System.out.println(restaurante);
        restauranteRepository.save(restauranteEntityMapper.toEntity(restaurante));
    }

    @Override
    public List<Restaurante> findAll(RestauranteListRequest paginationRequest) {
        Pageable pagination = PageRequest.of(paginationRequest.getPagina(),
                paginationRequest.getCantidad(),
                Sort.by(paginationRequest.getSort()).descending());
        return restauranteRepository.findAll(pagination).stream()
                .map(restauranteEntityMapper::toRestaurante).collect(Collectors.toList());
    }

    @Override
    public Restaurante findById(Integer id) {
        return restauranteEntityMapper.toRestaurante(restauranteRepository.findById(id).get());
    }

}
