package com.sankalp.redis.starter.service.impl;

import com.sankalp.redis.starter.model.Pair;
import com.sankalp.redis.starter.service.PairService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PairServiceImpl implements PairService {

    private final RedisTemplateService redisTemplateService;

    @Override
    public void savePair(Pair pair) {
        redisTemplateService.saveString(pair.getKey(), pair.getValue());
    }

    @Override
    public String getPairValueByKey(String key) {
        return redisTemplateService.getValueByKey(key);
    }

}
