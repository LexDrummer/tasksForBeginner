package main.java.ru.lexdrummer.loops;

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
    }
}
