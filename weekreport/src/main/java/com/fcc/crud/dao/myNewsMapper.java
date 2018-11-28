package com.fcc.crud.dao;

import com.fcc.crud.bean.myNews;
import com.fcc.crud.bean.myNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface myNewsMapper {
    long countByExample(myNewsExample example);

    int deleteByExample(myNewsExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(myNews record);

    int insertSelective(myNews record);

    List<myNews> selectByExample(myNewsExample example);

    myNews selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") myNews record, @Param("example") myNewsExample example);

    int updateByExample(@Param("record") myNews record, @Param("example") myNewsExample example);

    int updateByPrimaryKeySelective(myNews record);

    int updateByPrimaryKey(myNews record);
}