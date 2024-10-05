//class tanpa constructor atau disebut class polos

class Polos{
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa {
    String Nama;
    String Nim;
    String Prodi;
    

    Mahasiswa (String InputNama ,String InputNim,String InputProdi){
        Nama = InputNama;
        Nim = InputNim;
        Prodi = InputProdi;

        System.out.println("Nama Mahasiswa : " +  Nama);
        System.out.println("Nim : " +  Nim);
        System.out.println("Prodi : " + Prodi);



    }
   
}

//constructor nama yang sama dengan nma class
//constructor dipanggil saat object pertama kali dibuat
//constructor tidak mengembalikan nilai(tidak punya returns)


public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Polos objectPolos = new Polos();

        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 10;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);

        Mahasiswa mhs_1 = new Mahasiswa("haki","1342","pti");
        Mahasiswa mhs_2 = new Mahasiswa("hakii","134234","pti");
        
        
        
     }

}
