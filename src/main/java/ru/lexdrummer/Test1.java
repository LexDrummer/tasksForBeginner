package main.java.ru.lexdrummer;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Test1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        System.out.println("Введи число");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2029\u0085])?");
      while (true){
          if(N % 2 > 0){
                break;
                && ||
          }
          if(N <=2){
              break;
          }
          System.out.println("Not weird");
          if(N >=6){
              break;
          }
          if(N <= 20){
              break;
          }
          System.out.println("Weird");
      }
        scanner.close();

    }

        }
