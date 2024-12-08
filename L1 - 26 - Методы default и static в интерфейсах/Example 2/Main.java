interface InterfaceA {
    default void method() {
        System.out.println("Default метод интерфейса InterfaceA");
    }
}

interface InterfaceB {
    default void method() {
        System.out.println("Default метод интерфейса InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // Разрешение конфликта: реализация своего метода
    @Override
    public void method() {
        System.out.println("Реализация метода в классе MyClass");

        // Вызов конкретной реализации из InterfaceA
        InterfaceA.super.method();

        // Вызов конкретной реализации из InterfaceB
        InterfaceB.super.method();
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();
    }
}
