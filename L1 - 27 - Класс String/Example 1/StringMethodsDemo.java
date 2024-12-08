public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        String str2 = "hello, java!";

        // 1. length() - Возвращает длину строки
        System.out.println("Длина строки: " + str.length());

        // 2. charAt() - Возвращает символ по указанному индексу
        System.out.println("Символ на позиции 1: " + str.charAt(1));

        // 3. toUpperCase() - Преобразует строку в верхний регистр
        System.out.println("В верхнем регистре: " + str.toUpperCase());

        // 4. toLowerCase() - Преобразует строку в нижний регистр
        System.out.println("В нижнем регистре: " + str.toLowerCase());

        // 5. equals() - Проверяет равенство строк
        System.out.println("str равен str2? " + str.equals(str2));

        // 6. equalsIgnoreCase() - Проверяет равенство строк без учета регистра
        System.out.println("str равен str2 (игнорируем регистр)? " + str.equalsIgnoreCase(str2));

        // 7. contains() - Проверяет, содержит ли строка заданную подстроку
        System.out.println("Строка содержит 'Java': " + str.contains("Java"));

        // 8. replace() - Заменяет все вхождения одной строки на другую
        System.out.println("Замена 'Java' на 'World': " + str.replace("Java", "World"));

        // 9. substring() - Возвращает подстроку
        System.out.println("Подстрока с индекса 7: " + str.substring(7));

        // 10. split() - Разделяет строку на массив подстрок
        String[] parts = str.split(", ");
        System.out.println("Разделенные части строки:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
