package com.qin.Home.service.inter;

import com.qin.Common.entity.domain.ArtPermission;
import com.qin.Common.entity.domain.ArtPermissionExample;

import java.util.List;

public interface ArtPermissionService {
    int countByExample(ArtPermissionExample example);

    int deleteByExample(ArtPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ArtPermission record);

    int insertSelective(ArtPermission record);

    List<ArtPermission> selectByExample(ArtPermissionExample example);

    ArtPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective( ArtPermission record, ArtPermissionExample example);

    int updateByExample( ArtPermission record, ArtPermissionExample example);

    int updateByPrimaryKeySelective(ArtPermission record);

    int updateByPrimaryKey(ArtPermission record);
}