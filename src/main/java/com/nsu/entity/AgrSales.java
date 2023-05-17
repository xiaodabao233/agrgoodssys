package com.nsu.entity;

import java.util.Date;

public class AgrSales {
    private String agroutid;

    private Double outnum;

    private String distributorid;

    private Date updatetime;

    private Integer status;

    public String getAgroutid() {
        return agroutid;
    }

    public void setAgroutid(String agroutid) {
        this.agroutid = agroutid == null ? null : agroutid.trim();
    }

    public Double getOutnum() {
        return outnum;
    }

    public void setOutnum(Double outnum) {
        this.outnum = outnum;
    }

    public String getDistributorid() {
        return distributorid;
    }

    public void setDistributorid(String distributorid) {
        this.distributorid = distributorid == null ? null : distributorid.trim();
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