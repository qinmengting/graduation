package com.qin.Home.service.impl;

import com.qin.Common.entity.domain.ArtUser;
import com.qin.Common.entity.domain.UserRole;
import com.qin.Common.entity.domain.UserRoleExample;
import com.qin.Common.entity.dto.ArtUserDTO;
import com.qin.Common.entity.param.ArtUserParam;
import com.qin.Common.entity.vo.ArtUserVO;
import com.qin.Home.dal.inter.ArtUserMapper;
import com.qin.Home.service.inter.ArtUserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtUserServiceImpl implements ArtUserService {

    @Resource
    private ArtUserMapper artUserMapper;

    @Override
    public void insertArtUser(ArtUserDTO artUserDTO) {
        ArtUser artUser = new ArtUser();
        BeanUtils.copyProperties(artUserDTO,artUser);
        artUserMapper.insert(artUser);
    }

    @Override
    public void deleteArtUserByID(String studentID) {

    }

    @Override
    public List<ArtUserVO> selectArtUser(ArtUserParam artUserParam) {
        return null;
    }

    @Override
    public void updateArtUser(ArtUserDTO artUserDTO) {

    }

    @Override
    public int countByExample(UserRoleExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UserRoleExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(UserRole record) {
        return 0;
    }

    @Override
    public int insertSelective(UserRole record) {
        return 0;
    }

    @Override
    public List<UserRole> selectByExample(UserRoleExample example) {
        return null;
    }

    @Override
    public UserRole selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(UserRole record, UserRoleExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UserRole record, UserRoleExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UserRole record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserRole record) {
        return 0;
    }
}
