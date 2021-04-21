package com.qin.Home.service.impl;


import com.qin.Common.entity.convert.ArtMemberConvertMapper;
import com.qin.Common.entity.domain.ArtMember;
import com.qin.Common.entity.domain.ArtMemberExample;
import com.qin.Common.entity.dto.ArtMemberDTO;
import com.qin.Home.dal.inter.ArtMemberMapper;
import com.qin.Home.service.inter.ArtMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        if (artMemberDTO.getAccountName()!=null&&artMemberDTO.getAccountName()!=""){
            cr.andAccountNameEqualTo(artMemberDTO.getAccountName());
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
        if (artMemberDTO.getAccountName()!=null&&artMemberDTO.getAccountName()!=""){
            cr.andAccountNameEqualTo(artMemberDTO.getAccountName());
        }
        int i = artMemberMapper.deleteByExample(ex);
        return i;
    }

    @Override
    public int updateMember(ArtMemberDTO artMemberDTO) {
        ArtMemberExample ex = new ArtMemberExample();
        ArtMemberExample.Criteria cr = ex.createCriteria();
        if (artMemberDTO.getUsername()!=null&&artMemberDTO.getUsername()!=""){
            cr.andUsernameEqualTo(artMemberDTO.getUsername());
        }
        if (artMemberDTO.getStudentId()!=null&&artMemberDTO.getStudentId()!=""){
            cr.andStudentIdEqualTo(artMemberDTO.getStudentId());
        }
        if (artMemberDTO.getAccountName()!=null&&artMemberDTO.getAccountName()!=""){
            cr.andAccountNameEqualTo(artMemberDTO.getAccountName());
        }
        int i = artMemberMapper.countByExample(ex);
        ArtMember artMember = ArtMemberConvertMapper.INSTANCES.DTOtoArtMember(artMemberDTO);
        if (i == 0) {
            artMemberMapper.insert(artMember);
        }
        else {
            List<ArtMember> members = artMemberMapper.selectByExample(ex);
            ArtMember member = members.get(0);
            Long id = member.getId();
            artMember.setId(id);
            ArtMemberExample example = new ArtMemberExample();
            ArtMemberExample.Criteria criteria = example.createCriteria();
            criteria.andIdEqualTo(id);
            artMemberMapper.updateByExample(artMember,example);
        }
        return 0;
    }

    public ArtMemberMapper getArtMemberMapper() {
        return artMemberMapper;
    }

    public void setArtMemberMapper(ArtMemberMapper artMemberMapper) {
        this.artMemberMapper = artMemberMapper;
    }
}
