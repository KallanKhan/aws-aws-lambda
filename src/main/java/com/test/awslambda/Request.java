package com.test.awslambda;

import java.io.Serializable;

public class Request implements Serializable {

    private String body;

    public Request() {
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
