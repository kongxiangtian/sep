package com.fcc.crud.dao;

import com.fcc.crud.bean.shareReport;
import com.fcc.crud.bean.shareReportExample;
import com.fcc.crud.bean.shareReportKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface shareReportMapper {
    long countByExample(shareReportExample example);

    int deleteByExample(shareReportExample example);

    int deleteByPrimaryKey(shareReportKey key);

    int insert(shareReport record);

    int insertSelective(shareReport record);

    List<shareReport> selectByExample(shareReportExample example);

    shareReport selectByPrimaryKey(Integer sharereportid);

    int updateByExampleSelective(@Param("record") shareReport record, @Param("example") shareReportExample example);

    int updateByExample(@Param("record") shareReport record, @Param("example") shareReportExample example);

    int updateByPrimaryKeySelective(shareReport record);

    int updateByPrimaryKey(shareReport record);
}