package io.matheusvictor.springredis.service;

public interface CacheService {
    void evictAllCacheValues(String cacheName);
}
