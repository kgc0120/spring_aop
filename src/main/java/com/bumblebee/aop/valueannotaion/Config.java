package com.bumblebee.aop.valueannotaion;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author bumblebee
 */

@Component
public class Config {

    @Value("${active.root}")
    private String path;

    public String getPath() {
        return path;
    }
}
