package com.Naariah;

import com.Naariah.dao.UserDao;
import com.Naariah.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus03DmlApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll(){
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

    @Test
    void testSave(){
        User user = new User();
        user.setName("黑马程序员");
        user.setPassword("itheima");
        user.setAge(12);
        user.setTel("4006184000");
        userDao.insert(user);
    }
    @Test
    void testDelete(){
        userDao.deleteById(1L);
    }
    @Test
    void testUpdate(){
        User user = new User();
        user.setId(3L);
        user.setName("Jock666");
//        user.setVersion(1);
        userDao.updateById(user);
    }

}
