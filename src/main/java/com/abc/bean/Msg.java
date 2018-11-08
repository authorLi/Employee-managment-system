package com.abc.bean;

import java.util.HashMap;
import java.util.Map;

/*
通用的返回类
用来传递json数据
 */
public class Msg {
    //状态码,100是成功,200是失败
    private int code;
    //提示信息
    private String message;

    //用户要返回给浏览器的数据
    private Map<String, Object> extend = new HashMap<String, Object>();


    public static Msg success() {
        Msg result = new Msg();
        result.setCode(100);
        result.setMessage("处理成功");
        return result;
    }

    public static Msg fail() {
        Msg result = new Msg();
        result.setCode(200);
        result.setMessage("处理失败");
        return result;
    }

    public Msg add(String key, Object value) {
        this.getExtend().put(key, value);
        return this;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}