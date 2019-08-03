package cn.bdqn.pet.contorller;

import cn.bdqn.pet.entity.User;
import cn.bdqn.pet.service.UserService;
import cn.bdqn.pet.util.Result;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 用户控制器类
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*
    异步判断账号是否存在
     */
    @RequestMapping(value = "/exists",method = RequestMethod.GET)
    @ResponseBody
    public Object account_idIsExists(String account_no){
        Result result = new Result();
        int num = 0;
        try {
            num = userService.findUserNumByAccountNo(account_no);
            if (num > 0){
                result.setCode(1);
            }else{
                result.setCode(2);
                result.setMsg("对不起，您输入的账户不存在，请检查是否输入错误！");
            }
        }catch (Exception e){
            result.setCode(3);
            result.setMsgError();
        }
        return JSON.toJSONString(result);
    }

    /*
    登录
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Object login(String account_no, String password, HttpSession session){
        Result result = new Result();
        User user = null;
        try {
            user = userService.findUserByAccountNoAndPwd(account_no,password);
            if (user != null){
                result.setCode(1);
                session.setAttribute("user",user);
            }else {
                result.setCode(2);
                result.setMsg("密码错误，请重新输入！");
            }
        }catch (Exception e){
            result.setCode(3);
            result.setMsgError();
        }
        System.out.println(JSON.toJSONString(result));
        return JSON.toJSONString(result);
    }

}
