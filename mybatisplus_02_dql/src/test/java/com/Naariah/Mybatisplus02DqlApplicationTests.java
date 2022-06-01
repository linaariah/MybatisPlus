package com.Naariah;

import com.Naariah.dao.UserDao;
import com.Naariah.domain.User;
import com.Naariah.domain.query.UserQuery;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus02DqlApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
        void testGetAll(){
////        方式一：按条件查询
//        QueryWrapper qw = new QueryWrapper();
//        qw.lt("age",18);
//        List<User> userList = userDao.selectList(qw);
//        System.out.println(userList);

//          方拾二：lambda格式按条件查询
//        QueryWrapper<User> qw = new QueryWrapper<User>();
//        qw.lambda().lt(User::getAge, 10);//添加条件
//        List<User> userList = userDao.selectList(qw);
//        System.out.println(userList);
//          方法三：lambda格式按条件查询
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
////        lqw.lt(User::getAge, 30);
//////        lqw.gt(User::getAge, 10);
//        lqw.lt(User::getAge, 10).or().gt(User::getAge, 30);
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);

//
//        //模拟页面传递过来的查询数据
//        UserQuery uq = new UserQuery();
//        uq.setAge(10);
//        uq.setAge2(30);
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.lt(null!=uq.getAge2(),User::getAge, uq.getAge2());
//        lqw.gt(null!=uq.getAge(),User::getAge, uq.getAge());
//        List<User> userList2 = userDao.selectList(lqw);
//        System.out.println(userList2);



        //查询投影
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.select(User::getId,User::getName,User::getAge);
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);
    }



}
