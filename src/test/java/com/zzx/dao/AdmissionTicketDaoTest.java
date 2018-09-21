package com.zzx.dao;

import com.zzx.entity.AdmissionTicket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AdmissionTicketDaoTest {

    @Autowired
    private AdmissionTicketDao dao;

    @Test
    public void findOneTest(){
        AdmissionTicket a = dao.findById(1).get();
        System.out.println(a.toString());
    }

    @Test
    public void saveTest(){
        AdmissionTicket a = new AdmissionTicket();
        a.setName("李宇浩");
        a.setAdress("众众行");
        a.setIntroduction("啦啦啦");
        a.setImg("adbasdf");
        a.setNumber(12);
        a.setPhone("18635565585");
        a.setPrice(new BigDecimal(2.2));
        dao.save(a);
    }

    @Test
    public void updateTest(){
        AdmissionTicket a = new AdmissionTicket();
        a.setId(2);
        a.setName("李宇浩");
        a.setAdress("众众行");
        a.setIntroduction("啦啦啦");
        a.setImg("adbasdf");
        a.setNumber(12);
        a.setPhone("18635565585");
        a.setPrice(new BigDecimal(12.5));
        dao.save(a);
    }

    @Test
    public void deleteTest(){
       dao.deleteById(2);
    }

    @Test
    public void findByNameInTest(){
        List<AdmissionTicket> adm = dao.findByNameIn("王");
        Assert.assertNotEquals(0,adm.size());
    }

}