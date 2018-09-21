package com.zzx.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Ticket {

    /*车票id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketId;

    /*始发站*/
    private String startStation;

    /*终点站*/
    private String stopStation;

    /*票价*/
    private Double ticketPrice;

    /*车票数量*/
    private Integer ticketNum;

    /*车站电话*/
    private Integer ticketPhone;

    /*车票简介*/
    private String ticketIntroduction;

    /*车票图片*/
    private String ticketImg;


    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getStopStation() {
        return stopStation;
    }

    public void setStopStation(String stopStation) {
        this.stopStation = stopStation;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Integer getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
    }

    public Integer getTicketPhone() {
        return ticketPhone;
    }

    public void setTicketPhone(Integer ticketPhone) {
        this.ticketPhone = ticketPhone;
    }

    public String getTicketInTroduction() {
        return ticketIntroduction;
    }

    public void setTicketInTroduction(String ticketInTroduction) {
        this.ticketIntroduction = ticketInTroduction;
    }

    public String getTicketImg() {
        return ticketImg;
    }

    public void setTicketImg(String ticketImg) {
        this.ticketImg = ticketImg;
    }
}
