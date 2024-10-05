import java.util.Scanner;

// Kelas Kalkulator
class Kalkulator {
    private double bil1, bil2;

    Kalkulator(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public double tambah() {
        return bil1 + bil2;
    }

    public double kurang() {
        return bil1 - bil2;
    }

    public double kali() {
        return bil1 * bil2;
    }

    public double bagi() {
        if (bil2 != 0) {
            return bil1 / bil2;
        } else {
            System.out.println("Pembagian dengan nol tidak valid.");
            return 0;
        }
    }
}

// Kelas utama untuk menjalankan program
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
       
            System.out.print("Pilih operasi: (1) Tambah (2) Kurang (3) Kali (4) Bagi: ");
            int operasi = input.nextInt();

    
            System.out.print("Masukkan bil1: ");
            double bil1 = input.nextDouble();
            System.out.print("Masukkan bil2: ");
            double bil2 = input.nextDouble();

            Kalkulator kalkulator = new Kalkulator(bil1, bil2);

            if (operasi == 1) {
                System.out.println("Hasil: " + kalkulator.tambah());
            } else if (operasi == 2) {
                System.out.println("Hasil: " + kalkulator.kurang());
            } else if (operasi == 3) {
                System.out.println("Hasil: " + kalkulator.kali());
            } else if (operasi == 4) {
                System.out.println("Hasil: " + kalkulator.bagi());
            } else {
                System.out.println("Operasi tidak valid.");
            }

            System.out.print("Hitung lagi? (ya/tidak): ");
            ulang = input.next();
        } while (ulang.equalsIgnoreCase("ya"));

        System.out.println("Program selesai.");
        input.close();
    }
}
