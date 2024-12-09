package com.tutorial;

public class hero {
    String nama;
    double defensePower;
    double attackPower;

    //constructor
    hero(String nama , double defensePower, double attackPower){
        this.nama = nama;
        this.attackPower = attackPower;
        this.defensePower = defensePower;

    }

    void cetak(){
        System.out.println("nama :" + nama);
        System.out.println("attack :" + attackPower);
        System.out.println("defense :" + defensePower);
    }
    
}
