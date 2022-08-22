package com.mysql.mapper;

import com.mysql.Entity.User;

import java.util.List;
import java.util.Map;

public interface EducationMapper {
    public List<User> selectEducation();

    public List<User> selectByKeyWord(String work_name);
}
