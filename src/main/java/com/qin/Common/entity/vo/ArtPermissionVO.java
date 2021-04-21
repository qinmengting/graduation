package com.qin.Common.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtPermissionVO {
    private Long id;

    private Integer roleId;

    private Integer pId;

    private Date gmtCreate;

    private Date gmtModify;
}
