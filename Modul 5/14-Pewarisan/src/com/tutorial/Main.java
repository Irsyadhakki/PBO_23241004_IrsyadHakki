package com.tutorial;

//pewarisan adalah hubungan "is a"
public class Main {

    public static void main(String[] args) {

        hero hero1 = new hero();
        hero1.name = "Alucard";

        hero1.cetak();

        StrenghtHero hero2 = new StrenghtHero();
        hero2.name ="balmond";

        hero2.cetak();

        InttelegenceHero hero3 = new InttelegenceHero();
        hero3.name ="Hanzo";

        hero3.cetak();
        
    }
    
}
