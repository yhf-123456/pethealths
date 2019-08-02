package cn.bdqn.pet.util;

import java.io.Serializable;

/**
 * 异步请求返回对象类
 */
public class Result implements Serializable {

    //状态码 0失败 1成功 2未登录 3没有权限
    private Integer code;
    //返回信息
    private String msg;
    //返回数据
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setMsgError(){
        this.setMsg("您的网络有问题，请稍后重试！");
    }
}
