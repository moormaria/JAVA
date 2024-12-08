class A {
    int a = 10;

    void method() {
        System.out.println("Метод из A");
    }
}

class B extends A {
    // Здесь ничего нет
}

class C extends B {
    void method() {
        int a = super.a; // Доступ к полю a из класса A
        System.out.println("Поле a из суперкласса: " + a);
        super.method(); // Вызов метода из класса A
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.method();
    }
}
