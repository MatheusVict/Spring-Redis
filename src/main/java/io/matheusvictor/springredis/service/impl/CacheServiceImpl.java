package io.matheusvictor.springredis.service.impl;

import io.matheusvictor.springredis.domain.Company;
import io.matheusvictor.springredis.service.CacheService;
import io.matheusvictor.springredis.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class CacheServiceImpl implements CacheService {
    private CacheManager cacheManager;
    private CompanyService companyService;

    @Override
    public void evictAllCacheValues(String cacheName) {
        Objects.requireNonNull(cacheManager.getCache(cacheName)).clear();
    }

    @CachePut("companies")
    @Override
    public List<Company> updateCompanyCache() {
        return companyService.findAll();
    }


}
