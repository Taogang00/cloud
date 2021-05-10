package com.guanwei.account.client;

import lombok.Data;

@Data
public class ResultData {
    private int code;

    private String message;

    private Object result;
}
