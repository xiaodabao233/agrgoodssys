package com.nsu.entity;

import java.util.Date;

public class AgrInfo {
    private String agrid;

    private String cropid;

    private Double storagenum;

    private Double innum;

    private Double outnum;

    private Date updatetime;

    private Integer status;

    public String getAgrid() {
        return agrid;
    }

    public void setAgrid(String agrid) {
        this.agrid = agrid == null ? null : agrid.trim();
    }

    public String getCropid() {
        return cropid;
    }

    public void setCropid(String cropid) {
        this.cropid = cropid == null ? null : cropid.trim();
    }

    public Double getStoragenum() {
        return storagenum;
    }

    public void setStoragenum(Double storagenum) {
        this.storagenum = storagenum;
    }

    public Double getInnum() {
        return innum;
    }

    public void setInnum(Double innum) {
        this.innum = innum;
    }

    public Double getOutnum() {
        return outnum;
    }

    public void setOutnum(Double outnum) {
        this.outnum = outnum;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}