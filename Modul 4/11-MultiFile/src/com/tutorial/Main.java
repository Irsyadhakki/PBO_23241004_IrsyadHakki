package com.tutorial;

//Mengimport folder console.log
import com.Terminal.Console;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("irsyad hakki");
        Player player2 = new Player("Hakki irsyad");
        Player player3 = new Player("Hakki");
        Player player4 = new Player("irsyad");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        Console.log("Hallo Perkenalkan nama saya irsyad hakki");

        
    }
}
