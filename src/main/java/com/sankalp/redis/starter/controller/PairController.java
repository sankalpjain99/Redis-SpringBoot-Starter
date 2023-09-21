package com.sankalp.redis.starter.controller;

import com.sankalp.redis.starter.model.Pair;
import com.sankalp.redis.starter.service.PairService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
@RequiredArgsConstructor
public class PairController {

    private final PairService pairService;

    @PostMapping("/pair")
    public void savePair(@RequestBody Pair pair) {
        pairService.savePair(pair);
    }

    @GetMapping("/pair_value")
    public ResponseEntity<String> getPairValueByKey(@RequestParam String key) {
        String value = pairService.getPairValueByKey(key);
        return new ResponseEntity<>(value, HttpStatus.OK);
    }

}
