package com.fcc.crud.dao;

import com.fcc.crud.bean.shareReport;
import com.fcc.crud.bean.shareReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface shareReportMapper {
    long countByExample(shareReportExample example);

    int deleteByExample(shareReportExample example);

    int deleteByPrimaryKey(Integer shareid);

    int insert(shareReport record);

    int insertSelective(shareReport record);

    List<shareReport> selectByExample(shareReportExample example);

    shareReport selectByPrimaryKey(Integer shareid);

    int updateByExampleSelective(@Param("record") shareReport record, @Param("example") shareReportExample example);

    int updateByExample(@Param("record") shareReport record, @Param("example") shareReportExample example);

    int updateByPrimaryKeySelective(shareReport record);

    int updateByPrimaryKey(shareReport record);
}