package io.matheusvictor.springredis.service;

import io.matheusvictor.springredis.domain.Company;

import java.util.List;

public interface CacheService {
    void evictAllCacheValues(String cacheName);
    List<Company> updateCompanyCache();
}
