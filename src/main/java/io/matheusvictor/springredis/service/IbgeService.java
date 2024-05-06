package io.matheusvictor.springredis.service;

import io.matheusvictor.springredis.cloud.IbgeResponse;

import java.util.List;

public interface IbgeService {
    List<IbgeResponse> findAllCities(String state);
}
