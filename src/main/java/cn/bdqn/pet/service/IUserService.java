package cn.bdqn.pet.service;

import cn.bdqn.pet.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *
 * 用户服务层接口
 *
 * @author lcc
 * @since 2019-08-04
 */
public interface IUserService extends IService<User> {

    /*
    根据账号判断用户记录是否存在
     */
    int findUserNumByAccountNo(String account_no);

    /*
    根据用户账号和密码查询用户记录
     */
    User findUserByAccountNoAndPwd(String account_no, String password);
}
