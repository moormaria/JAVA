import java.util.Scanner;

public class GreetingApp {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения данных из консоли
        Scanner inputReader = new Scanner(System.in);

        // Запрашиваем у пользователя его имя
        System.out.print("Пожалуйста, введите ваше имя: ");
        String userName = inputReader.nextLine(); // Читаем строку, введенную пользователем

        // Выводим персонализированное приветствие
        System.out.println("Приветствую, " + userName + "!");
    }
}
