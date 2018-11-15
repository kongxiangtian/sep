package com.fcc.crud.bean;

import java.util.Date;

public class everyReport extends everyReportKey {
    private String username;

    private Date date;

    private Date time;

    private String lastweek;

    private String thisweek;

    private String attachurl;

    private String qanda;

    private String nextweek;

    private String reportdes;

    private Integer ifovertime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getLastweek() {
        return lastweek;
    }

    public void setLastweek(String lastweek) {
        this.lastweek = lastweek == null ? null : lastweek.trim();
    }

    public String getThisweek() {
        return thisweek;
    }

    public void setThisweek(String thisweek) {
        this.thisweek = thisweek == null ? null : thisweek.trim();
    }

    public String getAttachurl() {
        return attachurl;
    }

    public void setAttachurl(String attachurl) {
        this.attachurl = attachurl == null ? null : attachurl.trim();
    }

    public String getQanda() {
        return qanda;
    }

    public void setQanda(String qanda) {
        this.qanda = qanda == null ? null : qanda.trim();
    }

    public String getNextweek() {
        return nextweek;
    }

    public void setNextweek(String nextweek) {
        this.nextweek = nextweek == null ? null : nextweek.trim();
    }

    public String getReportdes() {
        return reportdes;
    }

    public void setReportdes(String reportdes) {
        this.reportdes = reportdes == null ? null : reportdes.trim();
    }

    public Integer getIfovertime() {
        return ifovertime;
    }

    public void setIfovertime(Integer ifovertime) {
        this.ifovertime = ifovertime;
    }
}