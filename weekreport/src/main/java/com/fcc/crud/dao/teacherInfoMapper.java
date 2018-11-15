package com.fcc.crud.dao;

import com.fcc.crud.bean.teacherInfo;
import com.fcc.crud.bean.teacherInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface teacherInfoMapper {
    long countByExample(teacherInfoExample example);

    int deleteByExample(teacherInfoExample example);

    int deleteByPrimaryKey(Integer teacherid);

    int insert(teacherInfo record);

    int insertSelective(teacherInfo record);

    List<teacherInfo> selectByExample(teacherInfoExample example);

    teacherInfo selectByPrimaryKey(Integer teacherid);

    int updateByExampleSelective(@Param("record") teacherInfo record, @Param("example") teacherInfoExample example);

    int updateByExample(@Param("record") teacherInfo record, @Param("example") teacherInfoExample example);

    int updateByPrimaryKeySelective(teacherInfo record);

    int updateByPrimaryKey(teacherInfo record);
}