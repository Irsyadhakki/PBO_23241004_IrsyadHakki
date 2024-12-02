class Player{
    private String nama;
    private static int numberOfPlayer;

    //kontruktor

    Player(String nama){

        this.nama = nama;
        Player.numberOfPlayer++;

    }
     //method static 
     static void showNumberOfPlayer(){
        System.out.println("Nama player :" + Player.numberOfPlayer);
    }

    void show(){
        System.out.println("Nama player :" + nama);
    }

   
}



public class App {
    public static void main(String[] args) throws Exception {

     Player player1 = new Player("lewi");
     Player player2 = new Player("CR7");
     Player player3 = new Player("MS10");

     Player.showNumberOfPlayer();
     

        



    }
}
