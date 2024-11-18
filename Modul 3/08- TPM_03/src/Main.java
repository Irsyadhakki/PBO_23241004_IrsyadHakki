class Pegawai {
    private int gajiPokok ;//= 5000000;
    private int tunjangan ;//= 1000000;
    private double pajak ;//= 10; 

    // Setter 
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Getter
    public int getGajiPokok() {
        return gajiPokok;
    }

    // Setter 
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Getter 
    public int getTunjangan() {
        return tunjangan;
    }

    // Setter 
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // Getter 
    public double getPajak() {
        return (gajiPokok + tunjangan) * (pajak / 100);
        
    }

    //mencetak gaji bersih
    public void cetakGajiBersih() {
        double gajiBersih = (gajiPokok + tunjangan) - getPajak();
        // System.out.println("Gaji Pokok : " + "Rp" + gajiPokok);
        // System.out.println("Tunjangan  : " + "Rp" + tunjangan);
        // System.out.println("Pajak      : " + "Rp" + getPajak());
        System.out.println("Gaji Bersih: " + "Rp" + gajiBersih);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek 
        Pegawai pegawai1 = new Pegawai();

        pegawai1.setGajiPokok(5000000); 
        pegawai1.setTunjangan(1000000); 
        pegawai1.setPajak(10); 

        // Menampilkan gaji bersih
        pegawai1.cetakGajiBersih();
    }
}
