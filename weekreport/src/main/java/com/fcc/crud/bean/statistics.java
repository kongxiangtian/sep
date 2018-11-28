package com.fcc.crud.bean;

public class statistics extends statisticsKey {
    private String statisticsname;

    private Integer intimecount;

    public String getStatisticsname() {
        return statisticsname;
    }

    public void setStatisticsname(String statisticsname) {
        this.statisticsname = statisticsname == null ? null : statisticsname.trim();
    }

    public Integer getIntimecount() {
        return intimecount;
    }

    public void setIntimecount(Integer intimecount) {
        this.intimecount = intimecount;
    }
}