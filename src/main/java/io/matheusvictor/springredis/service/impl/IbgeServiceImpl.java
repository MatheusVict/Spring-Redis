package io.matheusvictor.springredis.service.impl;

import io.matheusvictor.springredis.cloud.IBGE;
import io.matheusvictor.springredis.cloud.IbgeResponse;
import io.matheusvictor.springredis.service.IbgeService;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IbgeServiceImpl implements IbgeService {

    private IBGE ibge;


    @Cacheable(value = "states", condition = "#state.equalsIgnoreCase('PE')")
    @Override
    public List<IbgeResponse> findAllCities(String state) {
        return this.ibge.findAllCities(state);
    }
}
