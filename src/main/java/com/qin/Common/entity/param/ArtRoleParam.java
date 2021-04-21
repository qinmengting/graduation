package com.qin.Common.entity.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtRoleParam {
    private Long roleId;

    private Byte type;

    private String namezh;

    private String remark;

    private Date gmtCreate;

    private Date gmtModify;
}
