package com.tutorial;

public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;

    Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    
    public float luas() {
        return 0.5f * alas * tinggi;
    }

    public float keliling() {
        return 3 * alas;
    }

    void cetak() {
        System.out.println("Segitiga:");
        System.out.println("Luas: " + luas());
        System.out.println("keliling: " + keliling());

    }
}
