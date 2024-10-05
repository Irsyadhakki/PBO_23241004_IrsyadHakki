class Kalkulator{
    // atribut
    double Perkalian;
    double Pembagian;
    double Penjumlahan;
    double Pengurangan;

    // constructor
    Kalkulator (double bil1, double bil2){
        Penjumlahan = bil1 + bil2;
        Pengurangan = bil1 - bil2;
        Perkalian = bil1 * bil2;
        Pembagian = bil1 / bil2;
        
        System.out.println("\nHasil Penjumlahan : " + Penjumlahan);
        System.out.println("Hasil Pengurangan : " + Pengurangan);
        System.out.println("Hasil Perkalian  : " + Perkalian);
        System.out.println("Hasil Pembagian : " + Pembagian);
    }
}


public class App {
    public static void main(String[] args) throws Exception {

        // instansiasi object class kalkulator
        Kalkulator Kalkulator1 = new Kalkulator(2.9, 3.2);

        Kalkulator kalkulator2 = new Kalkulator(4, 4);

        Kalkulator kalkulator3 = new Kalkulator(10, 5); 
    }
}