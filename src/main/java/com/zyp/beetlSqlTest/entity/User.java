package com.zyp.beetlSqlTest.entity;

import lombok.Data;
import org.beetl.sql.core.annotatoin.Table;

import java.util.Date;

@Data
@Table(name="test.untitled")
public class User {
    private String userName;
    private Integer id;
    private String nickName;
    private Date cDate;
    private Date uDate;
}
