package JavaLessons;

public class ClassesAndObjects12 {
    public static void main(String[] args) { //
        Person1 person1 = new Person1();
        person1.name = "Рик";
        person1.age = 50;
        person1.sayHello();
        Person1 person2 = new Person1();
        person2.name = "Морти";
        person2.age = 16;
        person2.speak();
        person1.calculateYearsToRetirement();
        person2.calculateYearsToRetirement();
    }

}

class Person1{ // получает значения из класса main
    String name; // Данные
    int age; // Данные
    void calculateYearsToRetirement(){
        int years = 65-age;
        System.out.println("Кол-во лет до пенсии: "+years);
    }
    void speak(){ // void - "ничто"
        for(int i = 0;i<3;i++) {
            System.out.println("Меня зовут " + name + ", " + "мне " + age + " лет" + " и лососни тунца.");
        }
    }
    void sayHello(){
        System.out.println("Привет!");
    }
}



