package com.qin.Home.service.impl;


import com.qin.Common.entity.domain.ArtMember;
import com.qin.Common.entity.domain.ArtMemberExample;
import com.qin.Common.entity.dto.ArtMemberDTO;
import com.qin.Home.dal.inter.ArtMemberMapper;
import com.qin.Home.service.inter.ArtMemberService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "artMemberServiceImpl")
public class ArtMemberServiceImpl implements ArtMemberService {

    @Qualifier(value = "artMemberMapper")
    @Autowired
    private ArtMemberMapper artMemberMapper;

    public ArtMemberServiceImpl(ArtMemberMapper artMemberMapper) {
        this.artMemberMapper = artMemberMapper;
    }

    public ArtMemberServiceImpl() {
    }

    @Override
    public List<ArtMember> queryAllMembers() {
        List<ArtMember> members = artMemberMapper.queryAllMembers();
        return members;
    }

    @Override
    public List<ArtMember> queryMemberInfo(ArtMemberDTO artMemberDTO) {
        ArtMemberExample ex = new ArtMemberExample();
        ArtMemberExample.Criteria cr = ex.createCriteria();
        if (artMemberDTO.getUsername()!=null&&artMemberDTO.getUsername()!=""){
            cr.andUsernameEqualTo(artMemberDTO.getUsername());
        }
        if (artMemberDTO.getStudentId()!=null&&artMemberDTO.getStudentId()!=""){
            cr.andStudentIdEqualTo(artMemberDTO.getStudentId());
        }
        if (artMemberDTO.getMobile()!=null&&artMemberDTO.getMobile()!=""){
            cr.andMobileEqualTo(artMemberDTO.getMobile());
        }
        List<ArtMember> memberInfoList = artMemberMapper.selectByExample(ex);
        return memberInfoList;
    }

    @Override
    public int insertMember(ArtMember artMember) {
        int i = artMemberMapper.insert(artMember);
        return i;
    }

    @Override
    public int deleteMember(ArtMemberDTO artMemberDTO) {
        ArtMemberExample ex = new ArtMemberExample();
        ArtMemberExample.Criteria cr = ex.createCriteria();
        if (artMemberDTO.getUsername()!=null&&artMemberDTO.getUsername()!=""){
            cr.andUsernameEqualTo(artMemberDTO.getUsername());
        }
        if (artMemberDTO.getStudentId()!=null&&artMemberDTO.getStudentId()!=""){
            cr.andStudentIdEqualTo(artMemberDTO.getStudentId());
        }
        if (artMemberDTO.getMobile()!=null&&artMemberDTO.getMobile()!=""){
            cr.andMobileEqualTo(artMemberDTO.getMobile());
        }
        int i = artMemberMapper.deleteByExample(ex);
        return i;
    }

    @Override
    public int updateMember(ArtMember artMember) {
        ArtMemberExample ex = new ArtMemberExample();
        ArtMemberExample.Criteria cr = ex.createCriteria();
        if (artMember.getUsername()!=null&&artMember.getUsername()!=""){
            cr.andUsernameEqualTo(artMember.getUsername());
        }
        if (artMember.getStudentId()!=null&&artMember.getStudentId()!=""){
            cr.andStudentIdEqualTo(artMember.getStudentId());
        }
        int i = artMemberMapper.updateByExample(artMember, ex);
        return i;
    }

    public ArtMemberMapper getArtMemberMapper() {
        return artMemberMapper;
    }

    public void setArtMemberMapper(ArtMemberMapper artMemberMapper) {
        this.artMemberMapper = artMemberMapper;
    }
}
