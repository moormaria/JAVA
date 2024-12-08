public class BooleanExample {
    public static void main(String[] args) {
        Boolean b1 = Boolean.valueOf(true); // Прямое использование значения
        Boolean b2 = Boolean.valueOf("true"); // Из строки
        Boolean b3 = Boolean.valueOf("TrUe"); // Регистронезависимо
        Boolean b4 = Boolean.FALSE; // Использование константы FALSE
        Boolean b5 = Boolean.TRUE;  // Использование константы TRUE

        System.out.println("b1: " + b1); // true
        System.out.println("b2: " + b2); // true
        System.out.println("b3: " + b3); // true
        System.out.println("b4: " + b4); // false
        System.out.println("b5: " + b5); // true
    }
}