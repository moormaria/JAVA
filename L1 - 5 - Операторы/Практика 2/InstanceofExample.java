public class InstanceofExample {
    public static void main(String[] args) {
        Object obj = "Строка";
        String str = "Пример";
        Integer num = 10;

        // Пример использования instanceof
        System.out.println("obj instanceof String: " + (obj instanceof String)); // true
        System.out.println("str instanceof Object: " + (str instanceof Object)); // true
        System.out.println("num instanceof Number: " + (num instanceof Number)); // true

        // Пример с null
        obj = null;
        System.out.println("obj instanceof String: " + (obj instanceof String)); // false
    }
}
