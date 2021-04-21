package com.qin.Common.entity.convert;

import com.qin.Common.entity.domain.ArtMember;
import com.qin.Common.entity.dto.ArtMemberDTO;
import com.qin.Common.entity.param.ArtMemberParam;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-21T21:25:13+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_282 (Amazon.com Inc.)"
)
public class ArtMemberConvertMapperImpl implements ArtMemberConvertMapper {

    @Override
    public ArtMemberDTO toAArtMemberDTO(ArtMember artMember) {
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
}
