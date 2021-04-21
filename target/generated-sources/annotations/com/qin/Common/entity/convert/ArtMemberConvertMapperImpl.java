package com.qin.Common.entity.convert;

import com.qin.Common.entity.domain.ArtMember;
import com.qin.Common.entity.dto.ArtMemberDTO;
import com.qin.Common.entity.param.ArtMemberParam;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-21T22:34:04+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_282 (Amazon.com Inc.)"
)
public class ArtMemberConvertMapperImpl implements ArtMemberConvertMapper {

    @Override
    public ArtMemberDTO toArtMemberDTO(ArtMember artMember) {
        if ( artMember == null ) {
            return null;
        }

        ArtMemberDTO artMemberDTO = new ArtMemberDTO();

        artMemberDTO.setId( artMember.getId() );
        artMemberDTO.setUsername( artMember.getUsername() );
        artMemberDTO.setPassword( artMember.getPassword() );
        artMemberDTO.setAccountType( artMember.getAccountType() );
        artMemberDTO.setAccountName( artMember.getAccountName() );
        artMemberDTO.setMobile( artMember.getMobile() );
        artMemberDTO.setStudentId( artMember.getStudentId() );
        artMemberDTO.setTeacher( artMember.getTeacher() );
        artMemberDTO.setSpecialtyType( artMember.getSpecialtyType() );
        artMemberDTO.setJoinTime( artMember.getJoinTime() );
        artMemberDTO.setInGroupTime( artMember.getInGroupTime() );
        artMemberDTO.setRemark( artMember.getRemark() );
        artMemberDTO.setGmtCreate( artMember.getGmtCreate() );
        artMemberDTO.setGmtModify( artMember.getGmtModify() );

        return artMemberDTO;
    }

    @Override
    public ArtMember toArtMember(ArtMemberParam artMemberParam) {
        if ( artMemberParam == null ) {
            return null;
        }

        ArtMember artMember = new ArtMember();

        return artMember;
    }

    @Override
    public ArtMember DTOtoArtMember(ArtMemberDTO artMemberDTO) {
        if ( artMemberDTO == null ) {
            return null;
        }

        ArtMember artMember = new ArtMember();

        artMember.setId( artMemberDTO.getId() );
        artMember.setUsername( artMemberDTO.getUsername() );
        artMember.setPassword( artMemberDTO.getPassword() );
        artMember.setAccountType( artMemberDTO.getAccountType() );
        artMember.setAccountName( artMemberDTO.getAccountName() );
        artMember.setMobile( artMemberDTO.getMobile() );
        artMember.setStudentId( artMemberDTO.getStudentId() );
        artMember.setTeacher( artMemberDTO.getTeacher() );
        artMember.setSpecialtyType( artMemberDTO.getSpecialtyType() );
        artMember.setJoinTime( artMemberDTO.getJoinTime() );
        artMember.setInGroupTime( artMemberDTO.getInGroupTime() );
        artMember.setRemark( artMemberDTO.getRemark() );
        artMember.setGmtCreate( artMemberDTO.getGmtCreate() );
        artMember.setGmtModify( artMemberDTO.getGmtModify() );

        return artMember;
    }
}
