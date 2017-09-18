/*
 *  GreetingController.java
 *
 * Copyright (c) 2009-2017 CompuGroup Medical Software GmbH,
 *
 * This software is the confidential and proprietary information of
 * CompuGroup Medical Software GmbH. You shall not disclose
 * such confidential information and shall use it only in
 * accordance with the terms of the license agreement you
 * entered into with CompuGroup Medical Software GmbH.
*/

package com.cgm.bookmarks.controller;

import com.cgm.bookmarks.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Mihai Balaniscu.
 */

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}