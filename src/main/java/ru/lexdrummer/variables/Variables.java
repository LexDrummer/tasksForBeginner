package main.java.ru.lexdrummer.variables;

public class Variables {

    public static void main(String[] args) {
     /* 1. Объяви пару переменных z и v типа int и сразу проинициализируй (задай значения) их произвольными числами
     *  2. Объяви пару переменных q и w типа double. Проинициализируй их произвольными значениями в отдельных строках.
     *  3. Объяви переменную i типа int и сразу проинициализируй произвольным значением.
     *      Ниже объяви переменную j и присвой ей значение переменной i. Запусти программу и посмотри на результат.
     *      Загугли - присвоение значений примитивов в java.
     *  4. Объяви переменную x типа int и присвоей ей произвольное значение. Объяви переменную c типа char и присвой
     *      ей любое буквенное значение. Ниже присвой переменной x значение переменной c. Запусти программу и посмотри
     *      на результат. Загугли - численное отображение примитивов char в java. Поэксперементируй со значениями переменной с
     *      и понаблюдай за результатами выводов в консоли.
     * */

        // 1. enter your code below...
            byte z = 2; byte v = 4; // Change int on byte because i want to save program memory

        // uncomment line below to see result (delete //)
        System.out.println("Сумма двух чисел равна: " + (z + v));
        // 2. enter your code below...
        double q;
        q = 2.5;
        double w;
        w = 4.7;
        // uncomment line below to see result (delete //)
        System.out.println("Сумма двух вещественных чисел равна: " + (q + w));
        // 3. enter your code below...
            byte i = 7; // Change int on byte because i want to save program memory
            byte j = i;
        // uncomment line below to see result (delete //)
        System.out.println("I равно: " + i + "; J равно: " + j);

        // 4. enter your code below...
            int x = 1000;
            char c = '~';
            x = c;
        // uncomment line below to see result (delete //)
        System.out.println("Значение Х после присвоения значения из С равно: " + x);
    }
}
