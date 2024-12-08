// Класс объявлен как final
final class FinalClass {
    public void showMessage() {
        System.out.println("Это метод final-класса.");
    }
}

// Попытка унаследовать final класс вызовет ошибку компиляции
/*
class AttemptedSubclass extends FinalClass {
}
*/

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.showMessage(); // Вызов метода final-класса
    }
}
