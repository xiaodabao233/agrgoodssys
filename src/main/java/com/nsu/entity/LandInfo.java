package com.nsu.entity;

import java.util.Date;

public class LandInfo {
    private String landid;

    private String parkid;

    private String landnum;

    private String landname;

    private String lande;

    private String landw;

    private String lands;

    private String landn;

    private Double landsize;

    private Date updatetime;

    private Integer status;

    public String getLandid() {
        return landid;
    }

    public void setLandid(String landid) {
        this.landid = landid == null ? null : landid.trim();
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid == null ? null : parkid.trim();
    }

    public String getLandnum() {
        return landnum;
    }

    public void setLandnum(String landnum) {
        this.landnum = landnum == null ? null : landnum.trim();
    }

    public String getLandname() {
        return landname;
    }

    public void setLandname(String landname) {
        this.landname = landname == null ? null : landname.trim();
    }

    public String getLande() {
        return lande;
    }

    public void setLande(String lande) {
        this.lande = lande == null ? null : lande.trim();
    }

    public String getLandw() {
        return landw;
    }

    public void setLandw(String landw) {
        this.landw = landw == null ? null : landw.trim();
    }

    public String getLands() {
        return lands;
    }

    public void setLands(String lands) {
        this.lands = lands == null ? null : lands.trim();
    }

    public String getLandn() {
        return landn;
    }

    public void setLandn(String landn) {
        this.landn = landn == null ? null : landn.trim();
    }

    public Double getLandsize() {
        return landsize;
    }

    public void setLandsize(Double landsize) {
        this.landsize = landsize;
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