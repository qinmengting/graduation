package com.qin.Home.dal.inter;

import com.qin.Common.entity.domain.ArtRole;
import com.qin.Common.entity.domain.ArtRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtRoleMapper {
    int countByExample(ArtRoleExample example);

    int deleteByExample(ArtRoleExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(ArtRole record);

    int insertSelective(ArtRole record);

    List<ArtRole> selectByExample(ArtRoleExample example);

    ArtRole selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") ArtRole record, @Param("example") ArtRoleExample example);

    int updateByExample(@Param("record") ArtRole record, @Param("example") ArtRoleExample example);

    int updateByPrimaryKeySelective(ArtRole record);

    int updateByPrimaryKey(ArtRole record);
}