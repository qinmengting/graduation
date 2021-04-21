package com.qin.Common.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleDTO {
    private Long id;

    private Long uid;

    private Long rid;

    private Date gmtCreate;

    private Date gmtModify;
}
