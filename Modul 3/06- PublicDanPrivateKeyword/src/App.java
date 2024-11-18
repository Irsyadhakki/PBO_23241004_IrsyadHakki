class Data {
    //data member atau variable instand
    String nama;//default, dia bisa diakses di luar kelas
    public String prodi;//sama seperti defult bisa diakses diluar kelas
    private Double Ipk; //hanya bisa diakses oleh kelas itu sendiri


    //konstruktor
    Data(String nama,String prodi,Double Ipk){
        this.nama = nama;
        this.prodi = prodi;
        this.Ipk = Ipk;




        

    }
            //membuat default modifier access method(deffault)
            // menggunakan method tanpa parameter dan return
            void cetakData(){
                menambahIPK();//mengakses private method "setiap kali mencetak data ipk nya akan menamabah"
                System.out.println("nama :" + nama);
                System.out.println("prodi :"+ prodi);
                System.out.println("ipk :" + Ipk);
            
            }

            //membuat modifier access method
            public void ubahNama(String namaBaru){
                this.nama = namaBaru;

            }

            //private modifier acces method
            private void menambahIPK(){
                this.Ipk += 0.5;
            }

}


public class App {
    public static void main(String[] args) throws Exception {
        //instansiasi objek
        Data data1 = new Data("yogi","pti",3.14);

        //modifier access defult
        System.out.println(data1.nama);
        data1.nama= "hakki";
        System.out.println(data1.nama);


        //modifier acces public
        System.out.println(data1.prodi);
        data1.prodi= "sipil";
        System.out.println(data1.prodi);


        //modifier private
        // System.out.println(data1.Ipk);
        // data1.Ipk= "sipil"; 
        // System.out.println(data1.Ipk);

        //data tidak bisa diperlihatkan karna Private

        //method default
        data1.cetakData();


        //method public
        data1.ubahNama("dewa");
        data1.cetakData();

        // data1.menambahIPK(); tidak bisa dipakai karna private

    }
}
