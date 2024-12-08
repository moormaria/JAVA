public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Генерация исключения, которое будет поймано
            generateArithmeticException();

            // Генерация исключения, которое приведет к аварийному завершению программы
            generateNullPointerException();
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль было поймано и обработано.");
        }

        // Второе исключение не будет перехвачено и приведет к завершению программы
        // Код ниже не будет выполнен, если произойдет исключение в generateNullPointerException
        System.out.println("Этот код не будет выполнен, если произойдет NullPointerException.");
    }

    // Метод для генерации ArithmeticException
    public static void generateArithmeticException() {
        int result = 10 / 0;  // Деление на ноль
    }

    // Метод для генерации NullPointerException
    public static void generateNullPointerException() {
        String str = null;
        int length = str.length();  // Попытка вызвать метод на null
    }
}