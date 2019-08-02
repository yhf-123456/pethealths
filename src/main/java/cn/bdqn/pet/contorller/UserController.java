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
@Controller("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*
    异步判断账号是否存在
     */
    @RequestMapping("/exists")
    public Object account_idIsExists(String account_id){
        Result result = new Result();
        int num = 0;
        try {
            num = userService.findUserNumByAccountNo(account_id);
            if (num > 0){
                result.setCode(200);
            }else{
                result.setCode(404);
                result.setMsg("对不起，您输入的账户不存在，请检查是否输入错误！");
            }
        }catch (Exception e){
            result.setCode(500);
            result.setMsgError();
        }
        return JSON.toJSONString(result);
    }

    /*
    登录
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Object login(String account_id, String password, HttpSession session){
        Result result = new Result();
        User user = null;
        try {
            user = userService.findUserByAccountNoAndPwd(account_id,password);
            if (user != null){
                result.setCode(200);
                session.setAttribute("user",user);
            }else {
                result.setCode(404);
                result.setMsg("密码错误，请重新输入！");
            }
        }catch (Exception e){
            result.setCode(500);
            result.setMsgError();
        }
        return JSON.toJSONString(result);
    }
}
