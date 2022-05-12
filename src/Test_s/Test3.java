package Test_s;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
           // sc.nextLine();
            if ( i < 1 ) {
                System.out.println();
                System.out.println("================================");
            }
            /*
             java 100
ddp 50
pyton 34



            *
            * */
            String zero;
            if (x < 100) {
                if (x<10){
                    zero = "00";
                } else {
                    zero = "0";
                }
            } else { zero = "";
            }
            System.out.printf("%-15s %-15s\n", s1, zero+x);

            //Complete this line

        }
        sc.close();
        System.out.println("================================");

    }
}
