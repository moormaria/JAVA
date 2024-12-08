import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // Создание StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("Alice");
        joiner.add("Bob");
        joiner.add("Charlie");

        System.out.println("Список имен: " + joiner);

        // StringJoiner с разделителями, префиксом и суффиксом
        StringJoiner advancedJoiner = new StringJoiner(", ", "[", "]");
        advancedJoiner.add("Red");
        advancedJoiner.add("Green");
        advancedJoiner.add("Blue");

        System.out.println("Список цветов: " + advancedJoiner);

        // Пустой StringJoiner
        StringJoiner emptyJoiner = new StringJoiner(", ", "{", "}");
        System.out.println("Пустой список: " + emptyJoiner);
    }
}
