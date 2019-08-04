package cn.bdqn.pet.service.impl;

import cn.bdqn.pet.entity.Comment;
import cn.bdqn.pet.mapper.CommentMapper;
import cn.bdqn.pet.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lcc
 * @since 2019-08-04
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
