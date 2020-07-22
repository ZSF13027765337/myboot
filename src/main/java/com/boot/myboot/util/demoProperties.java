package com.boot.myboot.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class demoProperties {

    @Value("${com.boot.title}")
    private String title;
}
