package cn.bdqn.pet.entity;

import java.io.Serializable;

/**
 * 用户实体类
 */
public class User implements Serializable {

    private Integer id;//用户Id
    private String account_no;//用户账号
    private String password;//用户密码
    private String phone;//用户手机号码
    private String regist_time;//注册时间
    private String user_icon;//用户头像
    private String status;//用户状态 1未禁用 0禁用

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegist_time() {
        return regist_time;
    }

    public void setRegist_time(String regist_time) {
        this.regist_time = regist_time;
    }

    public String getUser_icon() {
        return user_icon;
    }

    public void setUser_icon(String user_icon) {
        this.user_icon = user_icon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
