package com.pxample.pemo.mapper;

import com.pxample.pemo.pojo.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {
    @Select("SELECT * from city WHERE state= #{state}")
    City findByState(@Param("state") String state);
}
