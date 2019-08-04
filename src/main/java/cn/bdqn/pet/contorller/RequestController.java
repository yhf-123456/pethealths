package cn.bdqn.pet.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 跳转页面controller
 */
@Controller
@RequestMapping("/sys")
public class RequestController {

    /*
    跳转到主页面
     */
    @RequestMapping("/index")
    public String toIndex(){ return "index.html"; }

    /*
    跳转到登录页面
     */
    @RequestMapping("/login")
    public String toLogin(){ return "login.html"; }
}
