package io.matheusvictor.springredis.controller;

import io.matheusvictor.springredis.service.CacheService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cache")
@AllArgsConstructor
public class CacheController {

    private final CacheService cacheService;

    @PostMapping
    public ResponseEntity<Void> evictAllCacheValues(@RequestParam String cacheName) {
        cacheService.evictAllCacheValues(cacheName);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Void> updateCompanyCache() {
        cacheService.updateCompanyCache();
        return ResponseEntity.noContent().build();
    }
}
