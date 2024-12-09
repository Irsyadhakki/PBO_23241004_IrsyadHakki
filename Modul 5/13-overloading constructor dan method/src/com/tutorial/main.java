package com.tutorial;

public class main {
    public static void main(String[] args) {
        
        player player1 = new player("hakki");
        player player2 = new player();//overloading
        player player3 = new player();//
        player player4 = new player("hakiki");


        player1.cetak();
        player2.cetak();
        player3.cetak();
        player4.cetak();
    }
    
}
