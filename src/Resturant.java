import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.Scanner;

class  Res {
     int tea=10;
     int coffee=8;
     int snacks=10;
     int idli=8;
     int dosa=6;
     String name;
     long phnno;
     int total;

     public Res(){

     }

     public Res(String name, long phnno) {
         this.name = name;
         this.phnno = phnno;


     }

    public void tea(int count) {
         this.tea = this.tea * count;
        System.out.println("total"+this.tea);

     }

     public  int coffee(int count) {
         this.coffee = this.coffee * count;
         return this.coffee;
     }

    public int snacks(int count) {
         this.snacks = this.snacks * count;
         return this.snacks;
     }

    public int idli(int count) {
         this.idli = this.idli * count;
         return this.idli;
     }

    public int dosa(int count) {
         this.dosa = this.dosa * count;
         return this.dosa;
     }
    public int getea() {
        return tea;

    }


    public class Resturant{
        public static void main(String[] args){
            ArrayList<Res> arr = new ArrayList<Res>();
            while (true) {
                System.out.println("Select an option \n 1 - Tea \n 2 - Coffee \n 3 - Snacks \n 4 - Idli \n 5 - Dosa \n 6 - Generate Bill\n 7-Exit");
                Scanner s = new Scanner(System.in);
                int n = s.nextInt();
                Res e1=new Res();
                switch (n){
                    case 1: System.out.println("enter the count");
                            int count=s.nextInt();
                        System.out.println("enter name");
                        String name=s.next();
                        System.out.println("enter phone number");
                        long number=s.nextLong();
                        Res e2=new Res(name,number);
                           arr.add(e2);
                           break;




                }

            }

    }

}

