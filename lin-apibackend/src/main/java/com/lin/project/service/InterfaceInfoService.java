package com.lin.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lin.api.model.entity.InterfaceInfo;


/**
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
