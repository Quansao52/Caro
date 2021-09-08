/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lenovo
 */
public class GameMatch {
    private int id;
    private int player1id;
    private int player2id;

    public GameMatch( int player1id, int player2id) {
        
        this.player1id = player1id;
        this.player2id = player2id;
    }
    public GameMatch(){
        super();
    }
    public int getId() {
        return id;
    }   
    public void setId(int id) {
        this.id = id;
    }

    public int getPlayer1id() {
        return player1id;
    }

    public void setPlayer1id(int player1id) {
        this.player1id = player1id;
    }

    public int getPlayer2id() {
        return player2id;
    }

    public void setPlayer2id(int player2id) {
        this.player2id = player2id;
    }
    
            
}
