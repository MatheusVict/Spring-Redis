package io.matheusvictor.springredis.service.impl;

import io.matheusvictor.springredis.service.CacheService;
import lombok.AllArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@AllArgsConstructor
public class CacheServiceImpl implements CacheService {
    private CacheManager cacheManager;

    @Override
    public void evictAllCacheValues(String cacheName) {
        Objects.requireNonNull(cacheManager.getCache(cacheName)).clear();
    }
}
