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
public class Diseasetitle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 疾病标题 id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 疾病分类关键词外键
     */
    @TableField("classifyId")
    private Integer classifyId;

    /**
     * 疾病标题
     */
    private String content;


}
