package com.tsmid.fransisco.tesdo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class model {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("company_id")
    @Expose
    private String companyId;
    @SerializedName("partner_id")
    @Expose
    private String partnerId;
    @SerializedName("create_date")
    @Expose
    private String createDate;
    @SerializedName("share")
    @Expose
    private String share;
    @SerializedName("write_uid")
    @Expose
    private String writeUid;
    @SerializedName("create_uid")
    @Expose
    private String createUid;
    @SerializedName("action_id")
    @Expose
    private Object actionId;
    @SerializedName("write_date")
    @Expose
    private String writeDate;
    @SerializedName("signature")
    @Expose
    private Object signature;
    @SerializedName("password_crypt")
    @Expose
    private String passwordCrypt;
    @SerializedName("alias_id")
    @Expose
    private Object aliasId;
    @SerializedName("sale_team_id")
    @Expose
    private String saleTeamId;
    @SerializedName("target_sales_done")
    @Expose
    private Object targetSalesDone;
    @SerializedName("target_sales_won")
    @Expose
    private Object targetSalesWon;
    @SerializedName("sidebar_visible")
    @Expose
    private String sidebarVisible;
    @SerializedName("default_operating_unit_id")
    @Expose
    private String defaultOperatingUnitId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getWriteUid() {
        return writeUid;
    }

    public void setWriteUid(String writeUid) {
        this.writeUid = writeUid;
    }

    public String getCreateUid() {
        return createUid;
    }

    public void setCreateUid(String createUid) {
        this.createUid = createUid;
    }

    public Object getActionId() {
        return actionId;
    }

    public void setActionId(Object actionId) {
        this.actionId = actionId;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    public Object getSignature() {
        return signature;
    }

    public void setSignature(Object signature) {
        this.signature = signature;
    }

    public String getPasswordCrypt() {
        return passwordCrypt;
    }

    public void setPasswordCrypt(String passwordCrypt) {
        this.passwordCrypt = passwordCrypt;
    }

    public Object getAliasId() {
        return aliasId;
    }

    public void setAliasId(Object aliasId) {
        this.aliasId = aliasId;
    }

    public String getSaleTeamId() {
        return saleTeamId;
    }

    public void setSaleTeamId(String saleTeamId) {
        this.saleTeamId = saleTeamId;
    }

    public Object getTargetSalesDone() {
        return targetSalesDone;
    }

    public void setTargetSalesDone(Object targetSalesDone) {
        this.targetSalesDone = targetSalesDone;
    }

    public Object getTargetSalesWon() {
        return targetSalesWon;
    }

    public void setTargetSalesWon(Object targetSalesWon) {
        this.targetSalesWon = targetSalesWon;
    }

    public String getSidebarVisible() {
        return sidebarVisible;
    }

    public void setSidebarVisible(String sidebarVisible) {
        this.sidebarVisible = sidebarVisible;
    }

    public String getDefaultOperatingUnitId() {
        return defaultOperatingUnitId;
    }

    public void setDefaultOperatingUnitId(String defaultOperatingUnitId) {
        this.defaultOperatingUnitId = defaultOperatingUnitId;
    }

}
