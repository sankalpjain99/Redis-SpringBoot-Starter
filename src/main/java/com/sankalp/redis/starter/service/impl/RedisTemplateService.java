package com.sankalp.redis.starter.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedisTemplateService {

    private final RedisTemplate<String, String> redisTemplate;

    public void saveString(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public String getValueByKey(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
