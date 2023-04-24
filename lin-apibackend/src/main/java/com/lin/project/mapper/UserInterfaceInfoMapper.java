package com.lin.project.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.api.model.entity.InterfaceInfo;
import com.lin.api.model.entity.UserInterfaceInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Entity generator.domain.UserInterfaceInfo
 */
@Mapper
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInterfaceInfo(@Param("limit") int limit);

}




