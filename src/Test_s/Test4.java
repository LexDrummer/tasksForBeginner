package Test_s;

import java.util.Scanner;

public class Test4 {
    public static void main(String [] args) {
        System.out.println("Введите числа от 0 до 50, в три строки через пробел и не более 3 чисел в каждой строке");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        }
        in.close();

        System.out.println(t);
    }
    }
