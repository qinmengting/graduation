package com.qin.Home.dal.inter;

import com.qin.Common.entity.domain.ArtUser;
import com.qin.Common.entity.domain.ArtUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtUserMapper {
    int countByExample(ArtUserExample example);

    int deleteByExample(ArtUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ArtUser record);

    int insertSelective(ArtUser record);

    List<ArtUser> selectByExample(ArtUserExample example);

    ArtUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ArtUser record, @Param("example") ArtUserExample example);

    int updateByExample(@Param("record") ArtUser record, @Param("example") ArtUserExample example);

    int updateByPrimaryKeySelective(ArtUser record);

    int updateByPrimaryKey(ArtUser record);
}