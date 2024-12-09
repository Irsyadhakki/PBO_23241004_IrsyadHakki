package com.tutorial;

public class HeroStrenght extends Hero {

    double defensePower;

    //overriding method
    void cetak (){
        System.out.println("\nhero Strenght");
        System.out.println("nama hero :" + this.nama);
        System.out.println("PowerDefense :" + defensePower);
    }
    
}
