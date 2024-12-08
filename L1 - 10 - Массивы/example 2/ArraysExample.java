import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {30, 20, 40, 10, 50};

        // toString - преобразование массива в строку
        System.out.println("Массив (toString): " + Arrays.toString(numbers));

        // sort - сортировка массива
        Arrays.sort(numbers);
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));

        // binarySearch - поиск элемента в отсортированном массиве
        int index = Arrays.binarySearch(numbers, 40);
        System.out.println("Индекс элемента 40: " + index);

        // equals - сравнение двух массивов
        int[] anotherNumbers = {10, 20, 30, 40, 50};
        boolean areEqual = Arrays.equals(numbers, anotherNumbers);
        System.out.println("Массивы равны: " + areEqual);

        // compare - сравнение массивов (по лексикографическому порядку)
        int[] comparisonArray = {15, 20, 35, 45, 55};
        int comparisonResult = Arrays.compare(numbers, comparisonArray);
        System.out.println("Результат сравнения массивов: " + comparisonResult);
    }
}
