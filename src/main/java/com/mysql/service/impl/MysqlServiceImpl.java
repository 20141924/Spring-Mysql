package com.mysql.service.impl;

import com.mysql.Entity.User;
import com.mysql.mapper.EducationMapper;
import com.mysql.service.MysqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MysqlServiceImpl implements MysqlService {
    @Autowired
    EducationMapper educationMapper;

    @Override
    public List<User> getEducation() {
        return educationMapper.selectEducation();
    }

    //模糊搜索

    @Override
    public List<User> queryByKeyWord(String work_name) {
        return educationMapper.selectByKeyWord(work_name);
    }
}
