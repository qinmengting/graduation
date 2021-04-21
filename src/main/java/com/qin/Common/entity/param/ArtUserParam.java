package com.qin.Common.entity.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtUserParam {
    private Long id;

    private String username;

    private String password;

    private Byte accountType;

    private String accountName;

    private String mobile;

    private String studentId;

    private String remark;

    private Date gmtCreate;

    private Date gmtModify;
}
