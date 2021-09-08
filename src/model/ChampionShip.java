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
public class ChampionShip {
    private int id;
    private Time time;
    private int prize;
    private int numberofparticipant;

    public ChampionShip(Time time, int prize, int numberofparticipant) {
        this.time = time;
        this.prize = prize;
        this.numberofparticipant = numberofparticipant;
    }
    public ChampionShip(){
        super();
    }

    public int getId() {
        return id;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getNumberofparticipant() {
        return numberofparticipant;
    }

    public void setNumberofparticipant(int numberofparticipant) {
        this.numberofparticipant = numberofparticipant;
    }
    
}
