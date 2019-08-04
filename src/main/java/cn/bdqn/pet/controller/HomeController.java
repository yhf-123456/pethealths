package cn.bdqn.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home() {
        return "index";
    }

    @RequestMapping("sousuo")
    public String sousuo() {
        return "blog";
    }


    @RequestMapping("zxwz")
    public String zxwz() {
        return "contact";
    }

    @RequestMapping("jkzx")
    public String jkzx() {
        return "gallery";
    }

    @RequestMapping("czlc")
    public String czlc() {
        return "services";
    }

    @RequestMapping("jbk")
    public String jbk() {
        return "gallery";
    }
}
