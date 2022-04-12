package main.java.ru.lexdrummer;
import java.util.Scanner;

public class do_while {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        //  System.out.println("Введи 5"); Дублирующие строки 7,8 и 10,11 так быть не должно заменяем кодом ниже
        //  int value = scanner.nextInt();
        // while(value!=5){
        //      System.out.println("Ввведи 5");
        //      value = scanner.nextInt();
        int value;
        do {
            System.out.println("Введи 5");
             value = scanner.nextInt();
        } while (value!=5);
        System.out.println("Вы ввели 5");
    }
}
