interface MyInterface {
    // Default метод
    default void defaultMethod() {
        System.out.println("Default метод интерфейса MyInterface");
    }

    // Static метод
    static void staticMethod() {
        System.out.println("Static метод интерфейса MyInterface");
    }
}

class MyClass implements MyInterface {
    @Override
    public void defaultMethod() {
        System.out.println("Переопределенный default метод в классе MyClass");
    }

    // Дополнительный метод
    public void invokeDefault() {
        // Вызов default метода интерфейса через суперинтерфейс
        MyInterface.super.defaultMethod();
    }
}

public class Main {
    public static void main(String[] args) {
        // Вызов static метода
        MyInterface.staticMethod();

        // Вызов default метода через объект
        MyClass obj = new MyClass();
        obj.defaultMethod();

        // Вызов оригинального default метода через суперинтерфейс
        obj.invokeDefault();
    }
}
