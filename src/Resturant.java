import java.util.ArrayList;
import java.util.Scanner;

class Res {
     int tea;
     int coffee;
     int snacks;
     int idli;
     int dosa;
     String name;
     long phnno;

     public Res(String name, long phnno) {
         this.name = name;
         this.phnno = phnno;


     }

     int tea(int count) {
         this.tea = this.tea * count;
         return this.tea;
     }

     int coffe(int count) {
         this.coffee = this.coffee * count;
         return this.coffee;
     }

     int snacks(int count) {
         this.snacks = this.snacks * count;
         return this.snacks;
     }

     int idli(int count) {
         this.idli = this.idli * count;
         return this.snacks;
     }

     int dosa(int count) {
         this.dosa = this.dosa * count;
         return this.dosa;
     }
 }
    public class Resturant{
        public static void main(String[] args){
            ArrayList<Res> arr = new ArrayList<Res>();
            while (true) {
                System.out.println("Select an option \n 1 - Tea \n 2 - Coffee \n 3 - Snacks \n 4 - Idli \n 5 - Dosa \n 6 - Generate Bill\n 7-Exit");
                Scanner input = new Scanner(System.in);
                int n = input.nextInt();
            }

    }

}

