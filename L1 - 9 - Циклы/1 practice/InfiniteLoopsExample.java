public class InfiniteLoopsExample {
    public static void main(String[] args) {
        // Бесконечный цикл while
        int counter = 0;
        while (true) {
            System.out.println("Infinite while loop iteration: " + counter++);
            if (counter >= 5) break; // Пример выхода из бесконечного цикла
        }

        // Бесконечный цикл do-while
        counter = 0;
        do {
            System.out.println("Infinite do-while loop iteration: " + counter++);
            if (counter >= 5) break; // Пример выхода из бесконечного цикла
        } while (true);
    }
}
