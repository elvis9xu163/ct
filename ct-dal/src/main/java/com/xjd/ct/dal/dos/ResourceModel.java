package com.xjd.ct.dal.dos;

import java.util.Date;

public class ResourceModel extends BaseDo {
    private String resId;

    private String resContentType;

    private String resFormat;

    private Byte resForm;

    private String resPath;

    private String resMd5;

    private Long resSize;

    private String resCut1;

    private String resCut2;

    private Date addTime;

    private Date updTime;

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getResContentType() {
        return resContentType;
    }

    public void setResContentType(String resContentType) {
        this.resContentType = resContentType;
    }

    public String getResFormat() {
        return resFormat;
    }

    public void setResFormat(String resFormat) {
        this.resFormat = resFormat;
    }

    public Byte getResForm() {
        return resForm;
    }

    public void setResForm(Byte resForm) {
        this.resForm = resForm;
    }

    public String getResPath() {
        return resPath;
    }

    public void setResPath(String resPath) {
        this.resPath = resPath;
    }

    public String getResMd5() {
        return resMd5;
    }

    public void setResMd5(String resMd5) {
        this.resMd5 = resMd5;
    }

    public Long getResSize() {
        return resSize;
    }

    public void setResSize(Long resSize) {
        this.resSize = resSize;
    }

    public String getResCut1() {
        return resCut1;
    }

    public void setResCut1(String resCut1) {
        this.resCut1 = resCut1;
    }

    public String getResCut2() {
        return resCut2;
    }

    public void setResCut2(String resCut2) {
        this.resCut2 = resCut2;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }
}