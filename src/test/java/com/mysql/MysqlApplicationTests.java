package com.mysql;

import com.mysql.service.MysqlService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
@RunWith(SpringRunner.class)
@SpringBootTest
class MysqlApplicationTests {
    @Autowired
    private MysqlService mysqlService;

    @Test
    void contextLoads() {

    }

}
