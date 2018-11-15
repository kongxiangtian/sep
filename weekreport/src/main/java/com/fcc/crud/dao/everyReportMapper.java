package com.fcc.crud.dao;

import com.fcc.crud.bean.everyReport;
import com.fcc.crud.bean.everyReportExample;
import com.fcc.crud.bean.everyReportKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface everyReportMapper {
    long countByExample(everyReportExample example);

    int deleteByExample(everyReportExample example);

    int deleteByPrimaryKey(everyReportKey key);

    int insert(everyReport record);

    int insertSelective(everyReport record);

    List<everyReport> selectByExample(everyReportExample example);

    everyReport selectByPrimaryKey(everyReportKey key);

    int updateByExampleSelective(@Param("record") everyReport record, @Param("example") everyReportExample example);

    int updateByExample(@Param("record") everyReport record, @Param("example") everyReportExample example);

    int updateByPrimaryKeySelective(everyReport record);

    int updateByPrimaryKey(everyReport record);
}