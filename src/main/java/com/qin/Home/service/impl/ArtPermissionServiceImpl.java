package com.qin.Home.service.impl;

import com.qin.Common.entity.domain.ArtPermission;
import com.qin.Common.entity.domain.ArtPermissionExample;
import com.qin.Home.dal.inter.ArtPermissionMapper;
import com.qin.Home.service.inter.ArtPermissionService;
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
public class ArtPermissionServiceImpl implements ArtPermissionService {

    @Autowired
    private ArtPermissionMapper artPermissionMapper;

    @Override
    public int countByExample(ArtPermissionExample example) {
        return artPermissionMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ArtPermissionExample example) {
        return artPermissionMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(ArtPermission record) {
        return 0;
    }

    @Override
    public int insertSelective(ArtPermission record) {
        return 0;
    }

    @Override
    public List<ArtPermission> selectByExample(ArtPermissionExample example) {
        return null;
    }

    @Override
    public ArtPermission selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(ArtPermission record, ArtPermissionExample example) {
        return 0;
    }

    @Override
    public int updateByExample(ArtPermission record, ArtPermissionExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(ArtPermission record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ArtPermission record) {
        return 0;
    }
}
