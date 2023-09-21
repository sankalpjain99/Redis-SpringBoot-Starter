package com.sankalp.redis.starter.service;

import com.sankalp.redis.starter.model.Pair;

public interface PairService {
    void savePair(Pair pair);
    String getPairValueByKey(String key);
}
