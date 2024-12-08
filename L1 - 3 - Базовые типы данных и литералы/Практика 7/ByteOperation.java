public class ByteOperation {
    public static void main(String[] args) {
        int num = 120;

        // byte directResult = num + 10; // Ошибка компиляции: num + 10 -> int
        byte castResult = (byte) (num + 10); // 130 -> -126
        // byte incrementResult = num + 1; // Ошибка компиляции: num + 1 -> int

        System.out.println("Результат с явным преобразованием: " + castResult); // -126
    }
}
