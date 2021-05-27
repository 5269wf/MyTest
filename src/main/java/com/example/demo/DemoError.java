package com.example.demo;

/**
 * date: 2021/1/4
 * author: wangfan
 * description: 状态码
 **/
public interface DemoError {
    /**
     * 正常
     */
    public static final Integer SUCCESS = 200;
    /**
     * 错误码：404
     * 找不到
     */
    public static final Integer ERROR_NOTFOUND = 404;
    /**
     * 错误码：500
     * 服务器错误
     */
    public static final Integer ERROR_SERVICE_ERROR = 500;

}
