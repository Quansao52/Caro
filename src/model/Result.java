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
public class Result {
    private int id;
    private boolean win;
    private Time timecompleteTime;
    private int point;
    
    public Result(){
        super();
    
    }
    public Result( boolean win, Time timecompleteTime, int point) {
        this.win = win;
        this.timecompleteTime = timecompleteTime;
        this.point = point;
    }

    public int getId() {
        return id;
    }    
    public void setId(int id) {
        this.id = id;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public Time getTimecompleteTime() {
        return timecompleteTime;
    }

    public void setTimecompleteTime(Time timecompleteTime) {
        this.timecompleteTime = timecompleteTime;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
}
