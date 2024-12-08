public class NarrowingConversion {
    public static void main(String[] args) {
        int largeValue = 256;
        byte narrowedValue = (byte) largeValue; // Переполнение
        System.out.println("Результат сужения: " + narrowedValue); // -128
    }
}
