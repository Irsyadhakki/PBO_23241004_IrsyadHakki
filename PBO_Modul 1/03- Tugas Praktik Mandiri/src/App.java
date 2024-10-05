import java.util.Scanner;

class Kalkulator {
    double bil1, bil2;

    Kalkulator(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public double hitung(int operasi) {
        if (operasi == 1) return bil1 + bil2;
        if (operasi == 2) return bil1 - bil2;
        if (operasi == 3) return bil1 * bil2;
        if (operasi == 4) return (bil2 != 0) ? bil1 / bil2 : 0;
        System.out.println("Operasi tidak valid.");
        return 0;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
            System.out.print("Pilih operasi: (1) Tambah (2) Kurang (3) Kali (4) Bagi: ");
            int operasi = input.nextInt();

            System.out.print("Masukkan dua bil1: ");
            double bil1 = input.nextDouble();
            System.out.print("Masukkan dua bil2: ");
            double bil2 = input.nextDouble();

            System.out.println("Hasil: " + new Kalkulator(bil1, bil2).hitung(operasi));

            System.out.print("Hitung lagi? (ya/tidak): ");
            ulang = input.next();
        } while (ulang.equalsIgnoreCase("ya"));

        System.out.println("Program selesai.");
        input.close();
    }
}
