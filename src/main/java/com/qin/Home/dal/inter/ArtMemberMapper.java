package com.qin.Home.dal.inter;

import com.qin.Common.entity.domain.ArtMember;
import com.qin.Common.entity.domain.ArtMemberExample;
import java.util.List;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component(value = "artMemberMapper")
public interface ArtMemberMapper {

    List<ArtMember> queryAllMembers();

    int countByExample(ArtMemberExample example);

    int deleteByExample(ArtMemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ArtMember record);

    int insertSelective(ArtMember record);

    List<ArtMember> selectByExample(ArtMemberExample example);

    ArtMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ArtMember record, @Param("example") ArtMemberExample example);

    int updateByExample(@Param("record") ArtMember record, @Param("example") ArtMemberExample example);

    int updateByPrimaryKeySelective(ArtMember record);

    int updateByPrimaryKey(ArtMember record);
}