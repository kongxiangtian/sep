package com.fcc.crud.bean;

import java.util.Date;

public class shareReport extends shareReportKey {
    private String sharename;

    private String username;

    private Date sharetime;

    public String getSharename() {
        return sharename;
    }

    public void setSharename(String sharename) {
        this.sharename = sharename == null ? null : sharename.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getSharetime() {
        return sharetime;
    }

    public void setSharetime(Date sharetime) {
        this.sharetime = sharetime;
    }
}