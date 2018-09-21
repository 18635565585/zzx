package com.zzx.dao;

import com.zzx.entity.AdmissionTicket;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface AdmissionTicketDao extends JpaRepository<AdmissionTicket,Integer> {

    List<AdmissionTicket> findByNameIn(String string);

}
