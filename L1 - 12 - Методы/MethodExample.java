// Базовый класс
class BaseClass {
    // Метод, который будет перегружен
    public void display(String message) {
        System.out.println("BaseClass: " + message);
    }

    // Перегруженный метод (другой тип аргумента)
    public void display(int number) {
        System.out.println("BaseClass (перегруженный метод): число = " + number);
    }

    // Метод, который будет переопределён
    public void overriddenMethod() {
        System.out.println("BaseClass: Метод можно переопределить.");
    }
}

// Подкласс
class SubClass extends BaseClass {
    // Переопределение метода
    @Override
    public void overriddenMethod() {
        System.out.println("SubClass: Переопределённый метод.");
    }

    // Перегруженный метод (новый аргумент)
    public void display(double number) {
        System.out.println("SubClass (перегруженный метод): дробное число = " + number);
    }
}

// Основной класс программы
public class MethodExample {
    public static void main(String[] args) {
        // Создание объекта базового класса
        BaseClass base = new BaseClass();
        base.display("Привет, мир!"); // Вызов базового метода
        base.display(42);            // Вызов перегруженного метода
        base.overriddenMethod();     // Вызов базового метода, который может быть переопределён

        // Создание объекта подкласса
        SubClass sub = new SubClass();
        sub.display("Привет, подкласс!"); // Вызов унаследованного метода
        sub.display(3.14);               // Вызов перегруженного метода в подклассе
        sub.overriddenMethod();          // Вызов переопределённого метода
    }
}
