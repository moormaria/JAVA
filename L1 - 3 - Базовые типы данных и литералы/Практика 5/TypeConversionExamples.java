public class TypeConversionExamples {
    public static void main(String[] args) {
        byte smallNumber = 10;
        int resultInt = smallNumber + 20; // byte -> int
        float resultFloat = resultInt + 2.5f; // int -> float
        double resultDouble = resultFloat + 1.1; // float -> double

        System.out.println("Результат: " + resultDouble); // 33.6
    }
}