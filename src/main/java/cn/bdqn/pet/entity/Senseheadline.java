package cn.bdqn.pet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class Senseheadline implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 常识标题详情id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 常识关键字外键
     */
    @TableField("commonId")
    private Integer commonId;

    /**
     * 常识标题
     */
    private String headline;


}
