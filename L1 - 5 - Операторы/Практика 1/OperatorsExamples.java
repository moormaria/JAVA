public class OperatorsExamples {
    public static void main(String[] args) {
        // 1. Операторы присваивания и арифметические операции
        int a = 10, b = 5;
        a += b; // a = a + b
        b -= 2; // b = b - 2
        a *= b; // a = a * b
        a /= b; // a = a / b
        a %= 3; // a = a % 3

        // 2. Условный оператор
        int max = (a > b) ? a : b;

        // 3. Логические операторы
        boolean isEqual = (a == b); // false
        boolean notEqual = (a != b); // true
        boolean bothTrue = (a > 1) && (b < 10); // true
        boolean eitherTrue = (a < 1) || (b > 1); // true

        // 4. Побитовые операторы
        int bitwiseAnd = a & b;
        int bitwiseOr = a | b;
        int bitwiseXor = a ^ b;
        int shiftLeft = a << 1;  // Сдвиг влево
        int shiftRight = a >> 1; // Сдвиг вправо
        int unsignedShiftRight = a >>> 1; // Беззнаковый сдвиг вправо

        // 5. Строки
        String text = "Привет";
        text += ", мир!"; // Конкатенация строк
        String concatenation = text + " Пример " + a;

        // 6. Префиксная и постфиксная форма операторов ++ и --
        int x = 5;
        int prefixIncrement = ++x; // x увеличивается перед использованием
        int postfixIncrement = x++; // x увеличивается после использования
        int prefixDecrement = --x; // x уменьшается перед использованием
        int postfixDecrement = x--; // x уменьшается после использования

        // Результаты
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("max: " + max);
        System.out.println("isEqual: " + isEqual);
        System.out.println("notEqual: " + notEqual);
        System.out.println("bitwiseAnd: " + bitwiseAnd);
        System.out.println("bitwiseOr: " + bitwiseOr);
        System.out.println("text: " + text);
        System.out.println("prefixIncrement: " + prefixIncrement);
        System.out.println("postfixIncrement: " + postfixIncrement);
        System.out.println("prefixDecrement: " + prefixDecrement);
        System.out.println("postfixDecrement: " + postfixDecrement);
    }
}
