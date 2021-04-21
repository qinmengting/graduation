package com.qin.Common.entity.domain;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@ToString
@Component
public class ArtMember {
    private Long id;

    private String username;

    private String password;

    private Byte accountType = 2;

    private String accountName;

    private String mobile;

    private String studentId;

    private String teacher;

    private Byte specialtyType = 0  ;

    private Date joinTime;

    private Byte inGroupTime = 0;

    private String remark;

    private Date gmtCreate;

    private Date gmtModify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getAccountType() {
        return accountType;
    }

    public void setAccountType(Byte accountType) {
        this.accountType = accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public Byte getSpecialtyType() {
        return specialtyType;
    }

    public void setSpecialtyType(Byte specialtyType) {
        this.specialtyType = specialtyType;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Byte getInGroupTime() {
        return inGroupTime;
    }

    public void setInGroupTime(Byte inGroupTime) {
        this.inGroupTime = inGroupTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }


    @Override
    public String toString() {
        return "ArtMember{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountType=" + accountType +
                ", accountName='" + accountName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", studentId='" + studentId + '\'' +
                ", teacher='" + teacher + '\'' +
                ", specialtyType=" + specialtyType +
                ", joinTime=" + joinTime +
                ", inGroupTime=" + inGroupTime +
                ", remark='" + remark + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModify=" + gmtModify +
                '}';
    }
}