package com.fcc.crud.dao;

import com.fcc.crud.bean.scoreInfo;
import com.fcc.crud.bean.scoreInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface scoreInfoMapper {
    long countByExample(scoreInfoExample example);

    int deleteByExample(scoreInfoExample example);

    int deleteByPrimaryKey(Integer teacherid);

    int insert(scoreInfo record);

    int insertSelective(scoreInfo record);

    List<scoreInfo> selectByExample(scoreInfoExample example);

    scoreInfo selectByPrimaryKey(Integer teacherid);

    int updateByExampleSelective(@Param("record") scoreInfo record, @Param("example") scoreInfoExample example);

    int updateByExample(@Param("record") scoreInfo record, @Param("example") scoreInfoExample example);

    int updateByPrimaryKeySelective(scoreInfo record);

    int updateByPrimaryKey(scoreInfo record);
}