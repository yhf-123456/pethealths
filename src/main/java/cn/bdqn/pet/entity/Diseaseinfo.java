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
public class Diseaseinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 疾病分类详情id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 疾病分类外键
     */
    @TableField("classifyId")
    private Integer classifyId;

    /**
     * 病情介绍外键
     */
    @TableField("presentationId")
    private Integer presentationId;

    /**
     * 解决方案外键
     */
    @TableField("solutionId")
    private Integer solutionId;

    /**
     * 预防方案外键
     */
    @TableField("preventId")
    private Integer preventId;

    /**
     * 发布时间
     */
    @TableField("pubTime")
    private LocalDateTime pubTime;

    /**
     * 发布人
     */
    @TableField("putUserId")
    private Integer putUserId;


}
