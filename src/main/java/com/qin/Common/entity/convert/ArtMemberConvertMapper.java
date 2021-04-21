package com.qin.Common.entity.convert;
import com.qin.Common.entity.domain.ArtMember;
import com.qin.Common.entity.dto.ArtMemberDTO;
import com.qin.Common.entity.param.ArtMemberParam;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ArtMemberConvertMapper {
    /**
     * 获取该类自动生成的实现类的实例
     * 接口中的属性都是 public static final 的 方法都是public abstract的
     */

    ArtMemberConvertMapper INSTANCES = Mappers.getMapper(ArtMemberConvertMapper.class);


    /**
     * dal
     */
//    @Mappings({
//            @Mapping(source = "username", target = "username"),
//            @Mapping(source = "password", target = "password")
//    })
    ArtMemberDTO toAArtMemberDTO(ArtMember artMember);

    ArtMember toArtMember(ArtMemberParam artMemberParam);

}
