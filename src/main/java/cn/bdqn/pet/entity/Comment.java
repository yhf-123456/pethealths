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
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论表id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 评论权重外键
     */
    @TableField("commentWiId")
    private Integer commentWiId;

    /**
     * 评论内容
     */
    private String comment;

    /**
     * 图片
     */
    private String img;

    /**
     * 发布人
     */
    @TableField("userId")
    private Integer userId;

    /**
     * 发布时间
     */
    private LocalDateTime pubtime;

    /**
     * 状态 1未禁用 0禁用
     */
    private String status;


}
