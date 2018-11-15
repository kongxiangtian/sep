package com.fcc.crud.dao;

import com.fcc.crud.bean.statistics;
import com.fcc.crud.bean.statisticsExample;
import com.fcc.crud.bean.statisticsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface statisticsMapper {
    long countByExample(statisticsExample example);

    int deleteByExample(statisticsExample example);

    int deleteByPrimaryKey(statisticsKey key);

    int insert(statistics record);

    int insertSelective(statistics record);

    List<statistics> selectByExample(statisticsExample example);

    statistics selectByPrimaryKey(statisticsKey key);

    int updateByExampleSelective(@Param("record") statistics record, @Param("example") statisticsExample example);

    int updateByExample(@Param("record") statistics record, @Param("example") statisticsExample example);

    int updateByPrimaryKeySelective(statistics record);

    int updateByPrimaryKey(statistics record);
}