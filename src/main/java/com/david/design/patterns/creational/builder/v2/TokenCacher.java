package com.david.design.patterns.creational.builder.v2;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * Created by wangwei on 2019/9/1.
 */
@Slf4j
public class TokenCacher {

    private static final String TOKEN_PREFIX = "token_";

//    // LRU算法
//    private static LoadingCache<String, String> localCache = CacheBuilder
//            .newBuilder().initialCapacity(1000).maximumSize(10000)
//            .expireAfterAccess(12, TimeUnit.HOURS).concurrencyLevel(5).build((CacheLoader) s -> {return s;});

}
