//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.zjh.common.exception;

public enum BizCodeEnum {
    UNKNOW_EXCEPTION(10000, "系统未知异常"),
    VAILD_EXCEPTION(10001, "参数格式校验失败"),
    TOO_MANY_REQUEST(10002, "请求流量过大"),
    SMS_CODE_EXCEPTION(10002, "验证码获取频率太高，稍后再试"),
    PRODUCT_UP_EXCEPTION(11000, "商品上架异常"),
    USER_EXIST_EXCEPTION(15001, "用户存在"),
    PHONE_EXIST_EXCEPTION(15002, "手机号存在"),
    NO_STOCK_EXCEPTION(21000, "商品库存不足"),
    LOGINACCT_PASSWORD_INVAILD_EXCEPTION(15003, "账号密码错误");

    private int code;
    private String msg;

    private BizCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
