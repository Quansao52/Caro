/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;

/**
 *
 * @author Lenovo
 */
public class PlayerGameMatch {
    private int id;
    private Time time;
    private String eventString;
    private int winnerid;
    private int totalmove;
    public PlayerGameMatch(){
        super();
    }
    public PlayerGameMatch(int id, Time time, String eventString,int winnerid,int totalmove){
        super();
        this.eventString=eventString;
        this.time=time;
        this.winnerid=winnerid;
        this.totalmove=totalmove;
    }

    public int getId() {
        return id;
    }   public void setId(int id) {
        this.id = id;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getEventString() {
        return eventString;
    }

    public void setEventString(String eventString) {
        this.eventString = eventString;
    }

    public int getWinnerid() {
        return winnerid;
    }

    public void setWinnerid(int winnerid) {
        this.winnerid = winnerid;
    }

    public int getTotalmove() {
        return totalmove;
    }

    public void setTotalmove(int totalmove) {
        this.totalmove = totalmove;
    }
    
}
