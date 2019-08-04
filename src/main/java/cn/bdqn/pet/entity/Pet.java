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
public class Pet implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户外键
     */
    @TableField("userId")
    private Integer userId;

    /**
     * 宠物名字
     */
    @TableField("petName")
    private String petName;

    /**
     * 宠物类型外键
     */
    @TableField("typeId")
    private Integer typeId;

    /**
     * 宠物品种外键
     */
    @TableField("breedId")
    private Integer breedId;

    /**
     * 宠物年龄外键
     */
    @TableField("ageId")
    private Integer ageId;

    /**
     * 宠物是否绝育 1未绝育 0绝育
     */
    private Integer sterilize;

    /**
     * 宠物头像
     */
    private String petImg;

    /**
     * 宠物状态
     */
    private String status;


}
