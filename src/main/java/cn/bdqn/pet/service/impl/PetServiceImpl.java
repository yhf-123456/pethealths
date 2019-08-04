package cn.bdqn.pet.service.impl;

import cn.bdqn.pet.entity.Pet;
import cn.bdqn.pet.mapper.PetMapper;
import cn.bdqn.pet.service.IPetService;
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
public class PetServiceImpl extends ServiceImpl<PetMapper, Pet> implements IPetService {

}
