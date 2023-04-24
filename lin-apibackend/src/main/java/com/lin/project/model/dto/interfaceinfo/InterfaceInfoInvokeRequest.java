package com.lin.project.model.dto.interfaceinfo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * 接口测试
 *
 * @TableName product
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {
    /**
     * 主键
     */

    private Long id;


    private String userRequestParams;



    private static final long serialVersionUID = 1;
}