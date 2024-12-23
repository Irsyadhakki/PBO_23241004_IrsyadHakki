package com.tutorial;

public class Main {
    public static void main(String[] args) {

        BangunDatar bangundatar = new BangunDatar();

        BangunDatar lingkaran = new Lingkaran(6);
        BangunDatar persegi = new Persegi(4);
        BangunDatar persegiPanjang = new PersegiPanjang(10, 5);
        BangunDatar segitiga = new Segitiga(6, 4);


        bangundatar.cetak();
        System.out.println();

        lingkaran.cetak();
        System.out.println();

        persegi.cetak();
        System.out.println();

        persegiPanjang.cetak();
        System.out.println();

        segitiga.cetak();
    }
    
}
