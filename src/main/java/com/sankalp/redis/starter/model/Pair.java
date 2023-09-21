package com.sankalp.redis.starter.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pair {
    private String key;
    private String value;
}
