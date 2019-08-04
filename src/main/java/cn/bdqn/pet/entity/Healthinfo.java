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
public class Healthinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成长记录健康详情id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 宠物成长外键
     */
    @TableField("petGrowthId")
    private Integer petGrowthId;

    /**
     * 宠物年龄外键
     */
    @TableField("petAgeId")
    private Integer petAgeId;

    /**
     * 生活习性--存路径
     */
    @TableField("lifeHabits")
    private String lifeHabits;

    /**
     * 饮食习惯--存路径
     */
    @TableField("eatHabits")
    private String eatHabits;

    /**
     * 是否需要配偶--存路径
     */
    @TableField("isMate")
    private String isMate;

    /**
     * 预防疾病外键
     */
    @TableField("diseasePreventionId")
    private String diseasePreventionId;

    /**
     * 1未禁用 0禁用
     */
    private String status;


}
