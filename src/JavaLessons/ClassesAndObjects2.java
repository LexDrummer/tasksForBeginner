package JavaLessons;

public class ClassesAndObjects2 {
    public static void main(String[] args) { //
        Person1 person1 = new Person1();
       // person1.name = "Рик";
        person1.setNameAndAge("Рик",50); // упрощает код в основном классе с помощью методов ниже
       // person1.age = 50;
        person1.speak();
        Person1 person2 = new Person1();
        person2.name = "Морти";
        person2.age = 16;
        person2.speak();
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: "+year1+" лет");
        System.out.println("Второму человеку до пенсии: "+year2+" лет");
    }

}

class Person1{ // получает значения из класса main
    String name; // Данные
    int age; // Данные

    void setNameAndAge(String username,int userage){ // задаем параметр, чтобы уменьшить код в основном классе и производить меньше действий
        name = username;
        age = userage;
    }
    int calculateYearsToRetirement(){ // () - параметры метода
        int years = 65-age;
        return years; // после того как посчитал, возвращает обратно в метод main и сразу же выходит из метода(break)
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



