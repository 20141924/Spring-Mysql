package com.mysql.controller;

import com.alibaba.fastjson.JSON;
import com.mysql.Entity.User;
import com.mysql.service.MysqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class PublisherController {
    @Autowired
    MysqlService mysqlService;

    @RequestMapping("education")
    public String education() {
        List<User> eduList = mysqlService.getEducation();
        return JSON.toJSONString(eduList);
    }

    //模糊查询
    @GetMapping("getListByKeyWord")
    public String queryByKeyWord(@RequestParam(value = "work_name")String work_name){
        List<User> goodsList = mysqlService.queryByKeyWord(work_name);
        //HashMqp里面添加数组
        //java.util.HashMap cannot be cast to com.mysql.Entity.User
//        HashMap<String, String> Sites = new HashMap<String, String>();
//        Sites.put(goodsList.get(0).toString()+goodsList.get(1).toString(),goodsList.get(2).toString());


//        StringBuilder sb = new StringBuilder();
//        if(!CollectionUtils.isEmpty(goodsList)){
//            for(int i=0;i<goodsList.size();i++){
//                if(i==0){
//                    sb.append(goodsList.get(i));
//                }
//                else{
//                    sb.append(",").append(goodsList.get(i));
//                }
//            }
//        }
//        System.out.println(sb.toString());


////        sb.append(goodsList.get(0));
//        for (int i=0;i<goodsList.size();i++)
//        {
//            System.out.println(goodsList.get(i));
//        }
//        sb.append(goodsList.get(1));
        //通过Map.entrySet遍历key和value，尤其是容量大时

        return JSON.toJSONString(goodsList);
    }

}
