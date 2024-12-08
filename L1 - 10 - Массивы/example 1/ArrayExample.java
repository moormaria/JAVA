public class ArrayExample {
    public static void main(String[] args) {
        int[] firstArray = {11, 12, 13, 14, 15};
        int[] secondArray = {21, 22, 23, 24, 25};

        // До переназначения
        System.out.println("Массив firstArray до переназначения: ");
        for (int num : firstArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Переназначение ссылки
        firstArray = secondArray;

        // После переназначения
        System.out.println("Массив firstArray после переназначения: ");
        for (int num : firstArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
