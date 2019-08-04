package cn.bdqn.pet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class Diseprevention implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成长记录预防疾病方案id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 宠物成长外键
     */
    @TableField("petGrowthId")
    private Integer petGrowthId;

    /**
     * 疾病信息
     */
    @TableField("diseaseInfo")
    private String diseaseInfo;

    /**
     * 预防方案
     */
    private String solution;

    /**
     * 发布时间
     */
    @TableField("putTime")
    private LocalDateTime putTime;

    /**
     * 发布人
     */
    @TableField("putUserId")
    private Integer putUserId;

    /**
     * 标记
     */
    private Integer mark;

    /**
     * 评论权重外键
     */
    @TableField("commentWiId")
    private Integer commentWiId;

    /**
     * 点赞
     */
    private Integer liek;


}
