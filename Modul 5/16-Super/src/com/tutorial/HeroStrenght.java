package com.tutorial;

public class HeroStrenght extends Hero {
    String nama = "class heroStrenght";


    //overriding
    void cetak(){

        //this.nama akan mengakses ini atau atribut ini dari class sendiri dulu
        System.out.println("ini adalah :" + this.nama);
        this.dummyMethod();
        super.dummyMethod();

        //sedangkan super.nama dia akan mengakses ini ke class utama 
        // System.out.println("ini adalah :" + super.nama);
    }

    //overriding
    void dummyMethod(){
        System.out.println("ini method sub class");
    }
    
}
