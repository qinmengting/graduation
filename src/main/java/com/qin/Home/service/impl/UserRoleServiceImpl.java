package com.qin.Home.service.impl;

import com.qin.Common.entity.domain.UserRole;
import com.qin.Common.entity.domain.UserRoleExample;
import com.qin.Home.service.inter.UserRoleService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleServiceImpl implements UserRoleService {
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
