package com.nsu.entity;

import java.util.Date;

public class AgrSupplier {
    private String supplierid;

    private String suppliername;

    private String supplieraddress;

    private String concatperson;

    private String concatmethod;

    private Date updatetime;

    private Integer status;

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getSupplieraddress() {
        return supplieraddress;
    }

    public void setSupplieraddress(String supplieraddress) {
        this.supplieraddress = supplieraddress == null ? null : supplieraddress.trim();
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