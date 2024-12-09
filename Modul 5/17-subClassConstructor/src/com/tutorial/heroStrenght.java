package com.tutorial;

public class heroStrenght extends hero{
    String Attribute = "strenght";
    
    heroStrenght(String nama, double defensePower, double attackPower){
        super(nama, defensePower, attackPower);
    }

    void cetak(){
        System.out.println("hero" + this.Attribute);
        super.cetak();
    }

    
}
