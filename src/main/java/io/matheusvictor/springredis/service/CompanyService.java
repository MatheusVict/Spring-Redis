package io.matheusvictor.springredis.service;

import io.matheusvictor.springredis.domain.Company;

import java.util.List;

public interface CompanyService {
    public List<Company> findAll();
    List<Company> findAllWithCache();
}
