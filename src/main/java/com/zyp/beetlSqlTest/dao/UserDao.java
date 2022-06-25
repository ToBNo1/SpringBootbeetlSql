package com.zyp.beetlSqlTest.dao;

import com.zyp.beetlSqlTest.entity.User;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;


@SqlResource("user")
public interface UserDao extends BaseMapper<User> {
    List<User> selectAll();
}
