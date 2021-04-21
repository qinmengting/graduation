package com.qin.Home.service.inter;


import com.qin.Common.entity.domain.UserRole;
import com.qin.Common.entity.domain.UserRoleExample;
import com.qin.Common.entity.dto.ArtUserDTO;
import com.qin.Common.entity.param.ArtUserParam;
import com.qin.Common.entity.vo.ArtUserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArtUserService {
    /**
     * 注册用户
     * @param artUserDTO
     */
    void insertArtUser(ArtUserDTO artUserDTO);

    /**
     * 根据学号删除用户
     * @param studentID
     */
    void deleteArtUserByID(String studentID);

    /**
     * 查询用户
     * @param artUserParam
     */
    List<ArtUserVO> selectArtUser(ArtUserParam artUserParam);

    /**
     * 修改用户
     * @param artUserDTO
     */
    void updateArtUser(ArtUserDTO artUserDTO);

    int countByExample(UserRoleExample example);

    int deleteByExample(UserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> selectByExample(UserRoleExample example);

    UserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);

}
