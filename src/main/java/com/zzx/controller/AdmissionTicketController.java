package com.zzx.controller;


import com.zzx.VO.ResuleVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buyer/admissionTicket")
public class AdmissionTicketController {

    @GetMapping("/list")
    public ResuleVO list(){
        ResuleVO  resuleVO= new ResuleVO();
        return resuleVO;
    }

}
