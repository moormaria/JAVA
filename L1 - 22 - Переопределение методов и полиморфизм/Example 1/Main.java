class Calculator {
    // Перегруженные методы для сложения чисел

    // Сложение двух целых чисел
    int add(int a, int b) {
        return a + b;
    }

    // Сложение трех целых чисел
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Сложение двух чисел с плавающей точкой
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Сложение двух целых чисел: " + calculator.add(2, 3));
        System.out.println("Сложение трех целых чисел: " + calculator.add(1, 2, 3));
        System.out.println("Сложение двух чисел с плавающей точкой: " + calculator.add(1.5, 2.5));
    }
}