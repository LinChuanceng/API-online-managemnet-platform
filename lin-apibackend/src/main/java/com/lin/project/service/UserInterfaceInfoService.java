package com.lin.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lin.api.model.entity.UserInterfaceInfo;

/**
 *
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean b);
    boolean invokeCount(long interfaceInfoId , long userId);
}
