class MOTOR{
    String merk;
    int tahun;
    String noPolisi;
    String warna;

    public MOTOR (String merk,int tahun,String noPolisi,String warna){
        this.merk = merk;
        this.tahun = tahun;
        this.noPolisi = noPolisi;
        this.warna = warna;
    }

    void showInfoMotor(){
        system.out.println("merk :" + this.merk);
        system.out.println("tahun :" + this.tahun);
        system.out.println("nomer polisi:" + this.noPolisi);
        system.out.println("warna  :" + this.warna);
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        MOTOR mtr1 = new MOTOR("honda",1999,"GT 007",biru);
        mtr1.showInfoMotor();

        
    }
}
