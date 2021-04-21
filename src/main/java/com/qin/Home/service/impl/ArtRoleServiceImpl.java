package com.qin.Home.service.impl;

import com.qin.Common.entity.domain.ArtRole;
import com.qin.Common.entity.domain.ArtRoleExample;
import com.qin.Home.dal.inter.ArtRoleMapper;
import com.qin.Home.service.inter.ArtRoleService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtRoleServiceImpl implements ArtRoleService {

    @Autowired
    private ArtRoleMapper artRoleMapper;

    @Override
    public int countByExample(ArtRoleExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ArtRoleExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long roleId) {
        return 0;
    }

    @Override
    public int insert(ArtRole record) {
        return 0;
    }

    @Override
    public int insertSelective(ArtRole record) {
        return 0;
    }

    @Override
    public List<ArtRole> selectByExample(ArtRoleExample example) {
        return null;
    }

    @Override
    public ArtRole selectByPrimaryKey(Long roleId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(ArtRole record, ArtRoleExample example) {
        return 0;
    }

    @Override
    public int updateByExample(ArtRole record, ArtRoleExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(ArtRole record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ArtRole record) {
        return 0;
    }
}
