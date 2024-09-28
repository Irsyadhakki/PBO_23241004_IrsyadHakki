import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            double angka1, angka2;
            char operator;
            double hasil = 0;

            System.out.println("(.______________.");
            System.out.println("(|_____Menu_____|");
            System.out.println("(|1.penjumlahan |");
            System.out.println("(|2.pengurangan |");
            System.out.println("(|3.perkalian   |");
            System.out.println("(|4.pembagian   |");
            System.out.println("(|______________|");

            System.out.println("Pilih menu oprator (1)(2)(3)(4): ");
            operator = scanner.next().charAt(0);

            System.out.println("Masukkan bil 1: ");
            angka1 = scanner.nextDouble();  

            System.out.println("Masukkan bil 2: ");
            angka2 = scanner.nextDouble();  

            // Menggunakan if-else untuk operasi kalkulator
            if (operator == '1') {
                hasil = angka1 + angka2;
            } else if (operator == '2') {
                hasil = angka1 - angka2;
            } else if (operator == '3') {
                hasil = angka1 * angka2;
            } else if (operator == '4') {
                if (angka2 != 0) {
                    hasil = angka1 / angka2;  
                } else {
                    System.out.println("Kesalahan! Pembagian dengan nol tidak diperbolehkan.");
                    continue;  // Lanjut ke awal perulangan
                }
            } else {
                System.out.println("Operator tidak valid!");
                continue;  // Lanjut ke awal perulangan jika operator tidak valid
            }

            System.out.println("Hasil: " + hasil);

            System.out.println("Mau hitung lagi? (ya/tidak): ");
            String jawaban = scanner.next();

            if (jawaban.equalsIgnoreCase("tidak")) {    
                lanjut = false;
                System.out.println("Terima kasih telah menggunakan kalkulator.");
            }
        }
    }
}
