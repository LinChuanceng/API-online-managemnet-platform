package com.lin.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lin.api.model.entity.InterfaceInfo;
import com.lin.project.common.ErrorCode;
import com.lin.project.exception.BusinessException;
import com.lin.project.mapper.InterfaceInfoMapper;
import com.lin.project.service.InterfaceInfoService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo> implements InterfaceInfoService {
    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，所有参数必须非空
//        if (add) {
//            if (StringUtils.isAnyBlank(content, job, place, education, loveExp) || ObjectUtils.anyNull(age, gender)) {
//                throw new BusinessException(ErrorCode.PARAMS_ERROR);
//            }
//        }
        if (name.isEmpty()) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "name为空");
        }
//        if (reviewStatus != null && !InterfaceInfoReviewStatusEnum.getValues().contains(reviewStatus)) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR);
//        }
//        if (age != null && (age < 18 || age > 100)) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR, "年龄不符合要求");
//        }
//        if (gender != null && !InterfaceInfoGenderEnum.getValues().contains(gender)) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR, "性别不符合要求");
//        }
    }
}




