package com.qin.Home.service.inter;



import com.qin.Common.entity.domain.ArtMember;
import com.qin.Common.entity.dto.ArtMemberDTO;

import java.util.List;

public interface ArtMemberService {
    /**
     * 查询所有成员信息
     * @return
     */
    List<ArtMember> queryAllMembers();

    /**
     * 按学号/姓名/手机号查询
     * @param artMemberDTO
     * @return
     */
    List<ArtMember> queryMemberInfo(ArtMemberDTO artMemberDTO);

    /**
     * 新增成员信息
     * @param artMember
     * @return
     */
    int insertMember(ArtMember artMember);

    /**
     * 删除成员信息(根据学号/姓名/手机号)
     * @param artMemberDTO
     * @return
     */
    int deleteMember(ArtMemberDTO artMemberDTO);

    /**
     * 修改成员信息(根据学号/姓名/）
     * @param artMemberDto
     * @return
     */
    int updateMember(ArtMemberDTO artMemberDTO);

}