package com.tutorial;

public class player {
    //atribut
    private String nama;
    //atribut statis
    private static int jumlahPlayer;

    //construtor
    //opsi 1
    player(String nama){
        player.jumlahPlayer++;
        this.nama = nama;

    }

    //overloading
    //opsi 2
    player(){
        player.jumlahPlayer++;
        this.nama = "player " + player.jumlahPlayer;
    }

    //cetak
    void cetak(){
        System.out.println("ini player " + this.nama);
    }

    
}
