package main.java.ru.lexdrummer.loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        /*
        * 1. Цикл while. Заведи две численные переменные и проинициализируй их
        *   произвольными числами меньше 10. Создай цикл while, который будет выводить в консоль значения обеих
        *   переменных в одной строке, после чего увеличивать каждую переменную на 2 и заканчивать свою работу
        *   когда сумма этих переменных будет больше 30. Обрати внимание, что число 30 входит в условие работы цикла.
        *
        * 2. Цикл for. Заведи переменную nearestLeapYear и проинициализируй ее значением 2020.
        *   Создай цикл for, который выведет на экран 10 последних високосных лет.
        *
        * 3. Switch-case. Создай цикл switch case для написания названия дня недели по номеру дня (от 1 до 7).
        *   При введении в консоль числа должно отобразиться название дня ( например input: 2, output: Вторник)
        *
        *
        * */

        // 1. enter your code below..
        int a = 2, b = 4;
        while (a + b <= 30) {   //f+king spelling
            System.out.println(a + b);
            a = a + 2;
           b = b + 2;
        }

        // 2. enter your code below..
            //int nearestLeapYear = 2020;
            for(int nearestLeapYear = 2020;nearestLeapYear>=1980;nearestLeapYear = nearestLeapYear-4){
                System.out.println(nearestLeapYear);
            }

        // 3. enter your code below..
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число от 1 до 7, мраз");
            int dayOfWeek = scanner.nextInt();
            scanner.close();
            String x;
            switch (dayOfWeek){
                case 1 : x = "Понедельник";
                break;
                case 2 : x = "Вторник";
                break;
                case 3 : x = "Среда";
                break;
                case 4 : x = "Четверг";
                break;
                case 5 : x = "Пятница";
                break;
                case 6 : x = "Суббота";
                break;
                case 7 : x = "Воскресенье";
              break;
                default:x="Неправильный номер дня";
            }
       System.out.println(x);

        //System.out.println(new Greeter().sayGreeter());

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age){
            case 0 :
                System.out.println("Ты родился");
                break;
            case 7 :
                System.out.println("Ты пошел в школу");
                break;
            case 18 :
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни один из вариантов не подходит, введи 0, 7, 18");
        }

    }
}
