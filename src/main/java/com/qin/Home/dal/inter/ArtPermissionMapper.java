package com.qin.Home.dal.inter;

import com.qin.Common.entity.domain.ArtPermission;
import com.qin.Common.entity.domain.ArtPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtPermissionMapper {
    int countByExample(ArtPermissionExample example);

    int deleteByExample(ArtPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ArtPermission record);

    int insertSelective(ArtPermission record);

    List<ArtPermission> selectByExample(ArtPermissionExample example);

    ArtPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ArtPermission record, @Param("example") ArtPermissionExample example);

    int updateByExample(@Param("record") ArtPermission record, @Param("example") ArtPermissionExample example);

    int updateByPrimaryKeySelective(ArtPermission record);

    int updateByPrimaryKey(ArtPermission record);
}