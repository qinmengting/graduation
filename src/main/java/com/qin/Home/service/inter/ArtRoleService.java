package com.qin.Home.service.inter;


import com.qin.Common.entity.domain.ArtRole;
import com.qin.Common.entity.domain.ArtRoleExample;

import java.util.List;

public interface ArtRoleService {
    int countByExample(ArtRoleExample example);

    int deleteByExample(ArtRoleExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(ArtRole record);

    int insertSelective(ArtRole record);

    List<ArtRole> selectByExample(ArtRoleExample example);

    ArtRole selectByPrimaryKey(Long roleId);

    int updateByExampleSelective( ArtRole record,  ArtRoleExample example);

    int updateByExample( ArtRole record,  ArtRoleExample example);

    int updateByPrimaryKeySelective(ArtRole record);

    int updateByPrimaryKey(ArtRole record);
}