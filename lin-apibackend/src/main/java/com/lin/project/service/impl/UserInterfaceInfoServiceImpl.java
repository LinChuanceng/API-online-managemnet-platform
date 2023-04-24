package com.lin.project.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lin.api.model.entity.UserInterfaceInfo;
import com.lin.project.common.ErrorCode;
import com.lin.project.exception.BusinessException;
import com.lin.project.mapper.UserInterfaceInfoMapper;
import com.lin.project.service.UserInterfaceInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 */
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo> implements UserInterfaceInfoService {

    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean b) {
        if (userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
//         创建时，所有参数必须非空
        if (b) {
            if (userInterfaceInfo.getId()<=0) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (userInterfaceInfo.getLeftNum()<0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "剩余次数不能小于0");
        }
    }

    @Override
    @Transactional
    public boolean invokeCount(long interfaceInfoId, long userId) {
        //判断参数
        if (interfaceInfoId <=0 || userId <=0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        LambdaQueryWrapper<UserInterfaceInfo> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(UserInterfaceInfo::getInterfaceInfoId,interfaceInfoId);
        lambdaQueryWrapper.eq(UserInterfaceInfo::getUserId,userId);
        UserInterfaceInfo userInterfaceInfo = this.getOne(lambdaQueryWrapper);
        userInterfaceInfo.setTotalNum(userInterfaceInfo.getTotalNum()+1);
        userInterfaceInfo.setLeftNum(userInterfaceInfo.getLeftNum()-1);
//        this.update(userInterfaceInfo,lambdaQueryWrapper);
        boolean b = this.updateById(userInterfaceInfo);
        return b;
    }
}




