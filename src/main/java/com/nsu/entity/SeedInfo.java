package com.nsu.entity;

import java.util.Date;

public class SeedInfo {
    private String seedid;

    private String seedname;

    private String supplierid;

    private Double storagenum;

    private Double innum;

    private Double outnum;

    private Date updatetime;

    private Integer status;

    public String getSeedid() {
        return seedid;
    }

    public void setSeedid(String seedid) {
        this.seedid = seedid == null ? null : seedid.trim();
    }

    public String getSeedname() {
        return seedname;
    }

    public void setSeedname(String seedname) {
        this.seedname = seedname == null ? null : seedname.trim();
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
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