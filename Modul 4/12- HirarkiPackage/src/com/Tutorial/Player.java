package com.Tutorial;

import com.Terminal.Console;


//vsibility nya default
// hanya bisa diakses oleh package yang sama 
class Player {
   private String nama;

   Player(String nama){
    this.nama = nama;

   }

   void cetak(){
    // System.out.println("player nama :" + this.nama);

    Console.log("Menggunakan Console");
    Console.log("Player nama :" + this.nama);
    
   }

   



    
}
