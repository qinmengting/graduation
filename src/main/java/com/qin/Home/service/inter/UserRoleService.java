package com.qin.Home.service.inter;


import com.qin.Common.entity.domain.UserRole;
import com.qin.Common.entity.domain.UserRoleExample;

import java.util.List;

public interface UserRoleService {
    int countByExample(UserRoleExample example);

    int deleteByExample(UserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> selectByExample(UserRoleExample example);

    UserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(UserRole record, UserRoleExample example);

    int updateByExample( UserRole record,  UserRoleExample example);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}