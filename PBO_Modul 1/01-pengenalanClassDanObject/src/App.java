class mahasiswa {
    String Nama;
    String Nim;
    String Hobi;
    String jurusan;
    double IPK;
    int umur;
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");

 
        mahasiswa mhs_1 = new mahasiswa();
        mhs_1.Nama = "haki";
        mhs_1.Nim = "23241004";
        mhs_1.Hobi = "bermain";
        mhs_1.jurusan = "pti";
        mhs_1.IPK = 3.25;
        mhs_1.umur = 63;

        System.out.println("nama mahasiswa : " + mhs_1.Nama );
        System.out.println("NIM : " + mhs_1.Nim );
        System.out.println("Hobi : " + mhs_1.Hobi );
        System.out.println("JURUSAN : " + mhs_1.jurusan);
        System.out.println("Ipk : " + mhs_1.IPK);
        System.out.println("umur : " + mhs_1.umur );


    }
}
