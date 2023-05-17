package com.nsu.entity;

import java.util.Date;

public class Dealer {
    private String distributorid;

    private String distributorname;

    private String distributoraddress;

    private String concatperson;

    private String concatmethod;

    private Date updatetime;

    private Integer status;

    public String getDistributorid() {
        return distributorid;
    }

    public void setDistributorid(String distributorid) {
        this.distributorid = distributorid == null ? null : distributorid.trim();
    }

    public String getDistributorname() {
        return distributorname;
    }

    public void setDistributorname(String distributorname) {
        this.distributorname = distributorname == null ? null : distributorname.trim();
    }

    public String getDistributoraddress() {
        return distributoraddress;
    }

    public void setDistributoraddress(String distributoraddress) {
        this.distributoraddress = distributoraddress == null ? null : distributoraddress.trim();
    }

    public String getConcatperson() {
        return concatperson;
    }

    public void setConcatperson(String concatperson) {
        this.concatperson = concatperson == null ? null : concatperson.trim();
    }

    public String getConcatmethod() {
        return concatmethod;
    }

    public void setConcatmethod(String concatmethod) {
        this.concatmethod = concatmethod == null ? null : concatmethod.trim();
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