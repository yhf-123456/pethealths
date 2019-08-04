package cn.bdqn.pet.service.impl;

import cn.bdqn.pet.entity.User;
import cn.bdqn.pet.mapper.UserMapper;
import cn.bdqn.pet.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 用户服务层实现类
 * </p>
 *
 * @author lcc
 * @since 2019-08-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
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
