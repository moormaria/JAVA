/**
 * Пример использования тернарного оператора (? :) вместо конструкции if-else.
 */
public class TernaryExample {
    public static void main(String[] args) {
        int a = 2;

        // Использование тернарного оператора для выбора значения переменной i
        int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;

        // Вывод значения переменной i
        System.out.println("i = " + i);
    }
}
