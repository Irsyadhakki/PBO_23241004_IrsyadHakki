class BangunDatar {
    // Atribut
    double panjang;   // Atribut untuk menyimpan nilai panjang
    double lebar;     // Atribut untuk menyimpan nilai lebar
    double luas;      // Atribut untuk menyimpan nilai luas
    double keliling;  // Atribut untuk menyimpan nilai keliling

    // Constructor
    BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method tanpa parameter dan return untuk menghitung luas
    void menghitungLuas() {
        luas = panjang * lebar;
        System.out.println("Luas: " + this.luas);
    }

    // Method tanpa parameter dan return untuk menghitung keliling
    void menghitungKeliling() {
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling: " + this.keliling);
    }

    // Method tanpa return dengan parameter untuk mengubah nilai panjang
    void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Method tanpa return dengan parameter untuk mengubah nilai lebar
    void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Method dengan return tanpa parameter untuk mendapatkan nilai luas
    double getLuas() {
        return this.luas;
    }

    // Method dengan return tanpa parameter untuk mendapatkan nilai keliling
    double getKeliling() {
        return this.keliling;
    }

    // Method dengan parameter dan return untuk menampilkan informasi bangun datar
    String tampilkanInfo(String namaBangun) {
        return "Bangun Datar: " + namaBangun + ", Panjang: " + panjang + ", Lebar: " + lebar;
    }
}

public class App {
    public static void main(String[] args) {
        // Instansi objek BangunDatar
        BangunDatar bdr_1 = new BangunDatar(2, 2);

        // Memanggil method menghitungLuas & menghitungKeliling
        bdr_1.menghitungLuas();
        bdr_1.menghitungKeliling();

        // Memanggil method setPanjang & setLebar untuk mengubah panjang dan lebar
        bdr_1.setPanjang(9);
        bdr_1.setLebar(9);

        // Cetak luas dan keliling setelah mengubah panjang dan lebar
        bdr_1.menghitungLuas();
        bdr_1.menghitungKeliling();

        // Memanggil method getLuas & getKeliling untuk mendapatkan nilai luas dan keliling
        double luasPersegiPanjang = bdr_1.getLuas();
        double kelilingPersegiPanjang = bdr_1.getKeliling();
        System.out.println("Luas: " + luasPersegiPanjang);
        System.out.println("Keliling: " + kelilingPersegiPanjang);

        // Memanggil method tampilkanInfo untuk menampilkan informasi bangun datar
        String infoBangun = bdr_1.tampilkanInfo("Persegi Panjang");
        System.out.println(infoBangun);
    }
}
