package com.nsu.entity;

import java.util.Date;

public class Crop {
    private String cropid;

    private String landid;

    private String seedid;

    private Date updatetime;

    private Integer ststus;

    public String getCropid() {
        return cropid;
    }

    public void setCropid(String cropid) {
        this.cropid = cropid == null ? null : cropid.trim();
    }

    public String getLandid() {
        return landid;
    }

    public void setLandid(String landid) {
        this.landid = landid == null ? null : landid.trim();
    }

    public String getSeedid() {
        return seedid;
    }

    public void setSeedid(String seedid) {
        this.seedid = seedid == null ? null : seedid.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getStstus() {
        return ststus;
    }

    public void setStstus(Integer ststus) {
        this.ststus = ststus;
    }
}