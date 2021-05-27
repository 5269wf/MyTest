package com.example.demo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * date: 2021/1/4
 * author: wangfan
 * description: todo
 **/
@Data
@Accessors(chain = true)
public class DemoResult<T> implements Serializable {
    private static final long serialVersionUID = 42L;

    private int code;

    private String msg;

    private boolean success;

    private T data;

    private DemoResult() {
    }

    private DemoResult(boolean success) {
        this.success = success;
    }

    public DemoResult(int code, boolean success) {
        this.code = code;
        this.success = success;
    }

    private DemoResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private DemoResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public DemoResult<T> createSuccessResult(T data) {
        DemoResult demoResult = new DemoResult<T>(DemoError.SUCCESS,true);
        demoResult.setData(data);
        return demoResult;
    }
    public DemoResult<T> createErrorResult(int code,String msg) {
        DemoResult demoResult = new DemoResult<>(code,msg);
        demoResult.setSuccess(false);
        return demoResult;
    }

}
