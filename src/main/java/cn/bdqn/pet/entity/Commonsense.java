package cn.bdqn.pet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lcc
 * @since 2019-08-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Commonsense implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 常识关键字id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 关键字
     */
    private String keyword;

    /**
     * 状态 1未禁用 0禁用
     */
    private String status;


}
