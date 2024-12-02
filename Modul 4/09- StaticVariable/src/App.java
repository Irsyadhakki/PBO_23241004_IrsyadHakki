class Display{
    //Objek variable
    String nama;

    //static variable
    static String tipe = "Display";


    //konstruktor
    Display (String nama){
        this.nama = nama;

    }

    //Membuat setter
    void settipe(String tipeInput){
        // tipe =tipeInput;//cara 1
        // this.tipe = tipeInput; //cara 2
        Display.tipe = tipeInput;

    }

    
     //method
    void cetak(){
        System.out.println("Display name :" + this.nama);

    }



}



public class App {
    public static void main(String[] args) throws Exception {
      //instansiasi objek

      Display display1 = new Display("monitor");
      display1.cetak();


      Display display2 = new Display("Televisi");
      display2.cetak();


      //menampilkan static variable atau class variable
      System.out.println("menampilkan static variable");
      System.out.println(display1.tipe);//diakses oleh objek
      System.out.println(Display.tipe);//diakses oleh class



    //coba ganti isi static variable
     Display.tipe="spanduk";
    //display1.tipe="HP";
    
     System.out.println(display1.tipe);
     System.out.println(display2.tipe);
     System.out.println(Display.tipe);



      //pakai setter untuk mengganti variable static

     display1.settipe("asus");
     System.out.println("objek1" +display1.tipe);
     System.out.println("objek2"+display2.tipe);
     System.out.println( "class"+Display.tipe);


    }
}
