package com.zzx.service.impl;

import com.zzx.entity.AdmissionTicket;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdmissionTicketServiceImplTest {

    @Autowired
    private AdmissionTicketServiceImpl admImpl;

    @Test
    public void list() {
        PageRequest pageRequest = new PageRequest(0,2);
        Page<AdmissionTicket> list = admImpl.list(pageRequest);
        System.out.println(list.getTotalElements());
    }

    @Test
    public void save() {
        AdmissionTicket adm = new AdmissionTicket();
        adm.setName("程俏");
        adm.setAdress("河南");
        adm.setImg("www");
        adm.setIntroduction("lalala");
        adm.setNumber(154);
        adm.setPhone("15933353236");
        adm.setPrice(new BigDecimal(20.5));
        admImpl.save(adm);
    }

    @Test
    public void update() {
        AdmissionTicket adm = new AdmissionTicket();
        adm.setName("程俏1");
        adm.setAdress("河南1");
        adm.setImg("www2");
        adm.setIntroduction("lalala");
        adm.setNumber(154);
        adm.setPhone("15933353236");
        adm.setPrice(new BigDecimal(20.5));
        adm.setId(1);
        admImpl.save(adm);
    }

    @Test
    public void delete() {
        admImpl.delete(3);
    }
}