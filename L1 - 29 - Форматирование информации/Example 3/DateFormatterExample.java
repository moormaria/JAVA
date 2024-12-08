import java.util.Calendar;
import java.util.Formatter;

public class DateFormatterExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        // Форматируем дату и время с использованием различных спецификаторов
        formatter.format("Час (24h): %tH\n", calendar); // %tH - Час (00–23)
        formatter.format("Час (12h): %tI\n", calendar); // %tI - Час (1–12)
        formatter.format("Месяц: %tm\n", calendar); // %tm - Месяц в двузначном формате (1–12)
        formatter.format("Год (двузначный): %ty\n", calendar); // %ty - Год в двузначном формате (00–99)
        formatter.format("Минуты: %tM\n", calendar); // %tM - Минуты как десятичное целое (00–59)

        // Выводим результат
        System.out.println(formatter.toString());

        // Закрываем formatter
        formatter.close();
    }
}
