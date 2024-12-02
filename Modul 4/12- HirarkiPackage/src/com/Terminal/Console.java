package com.Terminal;


//visibilitasnya bisa diakses oleh folder yang berbeda
public class Console {
    public static void log(String pesan) {
        System.out.println(pesan);
        
    }
    
}


//ini hanya bisa diakses dari package com.Terminal
class Terminal {
    public static void log(String pesan) {
        System.out.println(pesan);
        
    }

}
