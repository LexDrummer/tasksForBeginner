package JavaLessons;

public class ClassesAndObjects3 {
    public static void main(String[] args) { //
        Person2 person1 = new Person2();
        person1.setName(""); // Проверяет, ввели ли время
        person1.setAge(25); // Проверяет чтобы возраст был положительным
        System.out.println("Vivodim zna4enie v mein metode " + person1.getName());
        System.out.println("Vivodim zna4enie v mein metode " + person1.getAge());

    }

}

class Person2{ // получает значения из класса main
    private String name; // Данные
    private int age; // Данные

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("Ты ввёл пустое имя");
        } else {
        name = userName;}
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        if(userAge<0){
            System.out.println("Возраст должен быть положительным");
        } else {
        age = userAge;}
    }
    public int getAge(){
        return age;
    }



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
