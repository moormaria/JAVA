class Parent {
    // Метод объявлен как final
    public final void displayMessage() {
        System.out.println("Это метод суперкласса, который нельзя переопределить.");
    }
}

class Child extends Parent {
    // Попытка переопределить метод вызовет ошибку компиляции
    /*
    @Override
    public void displayMessage() {
        System.out.println("Попытка переопределить final метод.");
    }
    */
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayMessage(); // Вызов метода суперкласса
    }
}
