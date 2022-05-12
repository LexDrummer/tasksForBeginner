package JavaLessons;

public class Arrays {
    public static void main(String [] args){
        int number = 10; // примитивный тип данных в коробке НУМБЕРС лежит число 10
        int[] numbers = new int[5]; // numbers --> [массив] ссылочный тип данных
        System.out.println(numbers[0]); // 0 1 2 3 4
        // numbers[0]=10;
        // numbers[1]=20;
        for(int i = 0;i<numbers.length; i++){ // заполняем массив числами с помощью цикла for
            numbers[i] = i*10; // 0 10 20 30 40
        }
        for(int i = 0;i<numbers.length;i++){
            System.out.println(numbers[i]); // 0 10 20 30 40
        }
        int[] numbers1 = {1,2,3}; //ручной ввод данных в массив
        for(int i = 0;i<numbers1.length;i++){
            System.out.println(numbers1[i]); // 1,2,3
        }
    }
}
