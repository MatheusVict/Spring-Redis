package io.matheusvictor.springredis.controller;

import io.matheusvictor.springredis.cloud.IbgeResponse;
import io.matheusvictor.springredis.service.IbgeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ibge")
@AllArgsConstructor
public class IbgeController {

    private IbgeService ibgeService;

    @GetMapping
    public ResponseEntity<List<IbgeResponse>> getAllCitiesInState(@RequestParam String state) {
        return ResponseEntity.ok(ibgeService.findAllCities(state));
    }
}
