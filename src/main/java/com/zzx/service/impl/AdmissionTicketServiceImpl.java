package com.zzx.service.impl;

import com.zzx.dao.AdmissionTicketDao;
import com.zzx.entity.AdmissionTicket;
import com.zzx.service.AdmissionTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AdmissionTicketServiceImpl implements AdmissionTicketService {

    @Autowired
    private AdmissionTicketDao admDao;

    @Override
    public Page<AdmissionTicket> list(Pageable pageable) {
       return admDao.findAll(pageable);
    }

    @Override
    public void save(AdmissionTicket adm) {
        admDao.save(adm);
    }

    @Override
    public void update(AdmissionTicket adm) {
        admDao.save(adm);
    }

    @Override
    public void delete(Integer id) {
        admDao.deleteById(id);
    }
}
