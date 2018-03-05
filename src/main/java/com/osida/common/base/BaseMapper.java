package com.osida.common.base;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Young.Y.Yang on 2018/3/5
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
