class Animal {
    // Метод суперкласса
    void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Собака лает");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Полиморфизм
        myAnimal.sound(); // Вызывается метод подкласса
    }
}
