package cn.bdqn.pet.mapper;

import cn.bdqn.pet.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  用户数据库访问数据库层接口
 * </p>
 *
 * @author lcc
 * @since 2019-08-04
 */
public interface UserMapper extends BaseMapper<User> {

    /*
    根据账号判断用户记录是否存在
     */
    int getUserNumByAccountNo(String account_no);

    /*
    根据用户账号和密码查询用户记录
     */
    User getUserByAccountNoAndPwd(@Param("account_no")String account_no, @Param("password")String password);
}
