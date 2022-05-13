package Test_s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число от 2 до 20");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        if(2<= N && N<=20) {
            for(int i = 1; i<=10; i++){
                System.out.println(N + " x " + i + " = " + N * i);
            }

        } else {
            System.out.println("Вы ввели неверное число");

        }
    }
}
