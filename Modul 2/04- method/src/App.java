class mahasiswa{
    //data member
    String nama;
    String nim;



//constructor : ciri constructor  namanya sama dengan class

mahasiswa(String Nama,String Nim){
    // this itu adalah
   this.nama = Nama;
   this.nim = Nim;
   
}


// method tanpa parameter dan RETURN

void cetak(){
    System.out.println("nama :" + this.nama);
    System.out.println("nim :" + this.nim);

}

// method tanpa return dengan parameter

void setNama(String nama){
    this.nama=nama;

   

};


String getNama()  {
    return this.nama;

    
    
};

String getNim()  {
    return this.nim;
    
    
    
};


String sayHI(String nama){
    this.nama = nama;
    return "selamat datang " + this.nama + " di aplikasi kami";

}




    
}

public class App {
    public static void main(String[] args) throws Exception {
        

        //instansiasi objcet atau menciptakan
        mahasiswa mhs_1 = new mahasiswa("hakki","23241004");

        mhs_1.cetak();

        //memanggil method setNama
        mhs_1.setNama("irsyadhakki");
        //cetak setelah ubah nama
        mhs_1.cetak();


        //memanggil Method GetNama dan GetNim
        String nama_mhs = mhs_1.getNama();
        String nim_mhs = mhs_1.getNim();
        System.out.println("nama :" + nama_mhs);
        System.out.println("nim :" + nim_mhs);
        

        //memanggil method sayHI
        String pesan = mhs_1.sayHI(mhs_1.nama);
        System.out.println(pesan);
    }
}

// method adalah prilaku
// data member/ atribut


