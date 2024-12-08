import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerExample {
    public static void main(String[] args) {
        File file = new File("example.txt");  // Указываем путь к файлу
        try (Scanner scanner = new Scanner(file)) {  // Создаем объект Scanner для чтения файла
            // Чтение строк из файла
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();  // Читаем одну строку из файла
                System.out.println(line);  // Выводим строку на экран
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();  // Обработка исключения, если файл не найден
        }
    }
}