package com.zzx.service;

import com.zzx.entity.AdmissionTicket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AdmissionTicketService {

    Page<AdmissionTicket> list(Pageable pageable);

    void save(AdmissionTicket adm);

    void update(AdmissionTicket adm);

    void delete(Integer id);
}
