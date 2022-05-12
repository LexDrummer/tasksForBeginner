package JavaLessons;

public class ClassesAndObjects {      // основной класс должен соответствовать названию файла, он только один
    public static void main(String[] args) { //
        Person person1 = new Person(); // Класс main обращается к классу Person и отправляет туда значения которые я ему задал
        person1.name = "Рик";
        person1.age = 50;
        System.out.println("Меня зовут "+person1.name+", "+"мне "+person1.age+" лет"+" и лососни тунца.");
        Person person2 = new Person();
        person2.name = "Морти";
        person2.age = 16;
        System.out.println("Меня зовут "+person2.name+", "+"мне "+person2.age+" лет"+". Я люблю Джессику.");
    }

}
class Person{ // получает значения из класса main
    String name;
    int age;
}
class test{   // дополнительный вспомогательный класс их может быть много
    // У класса может быть:
    // 1.Данные (поля)
    // 2.Действия, которые он может соверщать (методы)
}