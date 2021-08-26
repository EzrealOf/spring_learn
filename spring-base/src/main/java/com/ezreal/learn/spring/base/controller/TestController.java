package com.ezreal.learn.spring.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2021/8/26.
 *
 * @author Ezreal
 * @since 2.0.0
 */
@RestController
public class TestController {

    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "helloWorld";

    }
}
