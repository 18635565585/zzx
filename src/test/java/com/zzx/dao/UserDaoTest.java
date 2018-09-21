package com.zzx.dao;


import com.zzx.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao dao;

    @Test
    public void findOneTest(){
        User a = dao.findById(1).get();
        System.out.println(a.toString());
    }

    @Test
    public void saveTest(){
        User user = new User();
        user.setName("李宇");
        user.setDate(new Date());
        user.setImg("12345");
        dao.save(user);
    }
}