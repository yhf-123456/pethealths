package cn.bdqn.pet.service.impl;

import cn.bdqn.pet.entity.Article;
import cn.bdqn.pet.mapper.ArticleMapper;
import cn.bdqn.pet.service.IArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
