public class A {
    public static int a = 1; // Статическое поле
    public static int b;     // Статическое поле

    // Статический метод
    public static void printVars() {
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);
    }

    public static void main(String[] args) {
        // Вызов через имя класса
        System.out.println("Вызов через имя класса:");
        A.printVars();

        // Вызов через объект
        System.out.println("\nВызов через объект:");
        A obj = new A();
        obj.printVars();
    }
}