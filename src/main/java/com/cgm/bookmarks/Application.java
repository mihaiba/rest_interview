package com.cgm.bookmarks;/*
 *  Application.java
 *
 * Copyright (c) 2009-2017 CompuGroup Medical Software GmbH,
 *
 * This software is the confidential and proprietary information of
 * CompuGroup Medical Software GmbH. You shall not disclose
 * such confidential information and shall use it only in
 * accordance with the terms of the license agreement you
 * entered into with CompuGroup Medical Software GmbH.
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Mihai Balaniscu.
 */

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}