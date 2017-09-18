/*
 *  Greeting.java
 *
 * Copyright (c) 2009-2017 CompuGroup Medical Software GmbH,
 *
 * This software is the confidential and proprietary information of
 * CompuGroup Medical Software GmbH. You shall not disclose
 * such confidential information and shall use it only in
 * accordance with the terms of the license agreement you
 * entered into with CompuGroup Medical Software GmbH.
*/

package com.cgm.bookmarks.model;

/**
 * Created by Mihai Balaniscu.
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}