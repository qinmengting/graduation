package com.qin.Common.entity.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtPermissionParam {
    private Long id;

    private Integer roleId;

    private Integer pId;

    private Date gmtCreate;

    private Date gmtModify;
}
