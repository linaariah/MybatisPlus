package com.Naariah;

import com.Naariah.dao.UserDao;
import com.Naariah.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void textGetAll() {
    List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

}
