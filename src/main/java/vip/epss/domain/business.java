package vip.epss.domain;

import java.math.BigDecimal;

public class business {
    private Integer businessid;

    private String businessname;

    private String businessaddress;

    private String businessexplain;

    private Integer ordertypeid;

    private BigDecimal starprice;

    private BigDecimal deliveryprice;

    private String remarks;

    private String businessimg;

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public String getBusinessaddress() {
        return businessaddress;
    }

    public void setBusinessaddress(String businessaddress) {
        this.businessaddress = businessaddress;
    }

    public String getBusinessexplain() {
        return businessexplain;
    }

    public void setBusinessexplain(String businessexplain) {
        this.businessexplain = businessexplain;
    }

    public Integer getOrdertypeid() {
        return ordertypeid;
    }

    public void setOrdertypeid(Integer ordertypeid) {
        this.ordertypeid = ordertypeid;
    }

    public BigDecimal getStarprice() {
        return starprice;
    }

    public void setStarprice(BigDecimal starprice) {
        this.starprice = starprice;
    }

    public BigDecimal getDeliveryprice() {
        return deliveryprice;
    }

    public void setDeliveryprice(BigDecimal deliveryprice) {
        this.deliveryprice = deliveryprice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getBusinessimg() {
        return businessimg;
    }

    public void setBusinessimg(String businessimg) {
        this.businessimg = businessimg;
    }

    public business() {
    }

    public business(Integer businessid, String businessname, String businessaddress, String businessexplain, Integer ordertypeid, BigDecimal starprice, BigDecimal deliveryprice, String remarks, String businessimg) {
        this.businessid = businessid;
        this.businessname = businessname;
        this.businessaddress = businessaddress;
        this.businessexplain = businessexplain;
        this.ordertypeid = ordertypeid;
        this.starprice = starprice;
        this.deliveryprice = deliveryprice;
        this.remarks = remarks;
        this.businessimg = businessimg;
    }

    @Override
    public String toString() {
        return "business{" +
                "businessid=" + businessid +
                ", businessname='" + businessname + '\'' +
                ", businessaddress='" + businessaddress + '\'' +
                ", businessexplain='" + businessexplain + '\'' +
                ", ordertypeid=" + ordertypeid +
                ", starprice=" + starprice +
                ", deliveryprice=" + deliveryprice +
                ", remarks='" + remarks + '\'' +
                ", businessimg='" + businessimg + '\'' +
                '}';
    }
}