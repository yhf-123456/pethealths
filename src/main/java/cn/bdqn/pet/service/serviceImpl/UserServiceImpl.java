package cn.bdqn.pet.service.serviceImpl;

import cn.bdqn.pet.dao.UserMapper;
import cn.bdqn.pet.entity.User;
import cn.bdqn.pet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务层实现类
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int findUserNumByAccountNo(String account_no) {
        return userMapper.getUserNumByAccountNo(account_no);
    }

    @Override
    public User findUserByAccountNoAndPwd(String account_no, String password) {
        return userMapper.getUserByAccountNoAndPwd(account_no,password);
    }
}
