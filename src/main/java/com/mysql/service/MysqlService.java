package com.mysql.service;

import com.mysql.Entity.User;

import java.util.List;
import java.util.Map;

public interface MysqlService {
    public List<User> getEducation();

    public List<User> queryByKeyWord(String work_name);

}
