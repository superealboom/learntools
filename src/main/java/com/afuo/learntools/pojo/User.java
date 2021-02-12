package com.afuo.learntools.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @Description: TODO
 * @Date: 2021/2/12 10:58
 * @Author: afuo
 */

@Data
public class User {

//    @TableId(type = IdType.ASSIGN_ID)
//    主键类型为长或字符串（分别对应的MySQL的表字段为BIGINT和VARCHAR）

//    @TableId(type = IdType.ASSIGN_UUID)
//    重新自动生成排除中划线的UUID作为主键。主键类型为String，对应MySQL的表分段为VARCHAR（32）
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    //版本号
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;

    //逻辑删除
    @TableLogic
    private Integer deleted;

}
