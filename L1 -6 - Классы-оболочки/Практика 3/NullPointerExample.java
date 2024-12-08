public class NullPointerExample {
    public static void main(String[] args) {
        Integer boxed = null;

        try {
            int unboxed = boxed; // Автораспаковка из null
        } catch (NullPointerException e) {
            System.out.println("Автораспаковка привела к NullPointerException.");
        }

        int value = 42;
        Integer autoBoxed = value; // Автоупаковка
        System.out.println("autoBoxed: " + autoBoxed);
    }
}