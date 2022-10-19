package com.bumblebee.aop.valueannotaion;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author bumblebee
 */
@Service
@RequiredArgsConstructor
public class ConfigService {

    private final Config config;

//    public ConfigService(Config config) {
//        this.config = config;
//    }

//    public String findActiveRoot() {
//        return config.getPath();
//    }

}
