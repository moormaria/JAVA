public class VarArgsExample {

    // ????? ? ?????????? ?????? ????????????? ??????????
    public void printNumbers(int... numbers) {
        System.out.println("Calling printNumbers(int...)");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // ????????????? ?????: ????????????? ???????? ? ?????????? ????? ????????????? ??????????
    public void printNumbers(String label, int... numbers) {
        System.out.println("Calling printNumbers(String, int...)");
        System.out.println(label);
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // ????????????? ?????: ?????????? ????? ????????
    public void printObjects(Object... objects) { // ???????? ??? ??????
        System.out.println("Calling printObjects(Object...)");
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        VarArgsExample example = new VarArgsExample();

        // ????? ?????? ? ?????????? ?????? ????????????? ??????????
        example.printNumbers(1, 2, 3); // ????? ????? int...

        // ????? ?????? ? ????????????? ?????????? ? ?????????? ?????? ????????????? ??????????
        example.printNumbers("Numbers:", 4, 5, 6); // ????? ????? String + int...

        // ????? ?????? ? ?????????? ?????? ????????
        example.printObjects("Hello", 7, 8.5, true); // ????? ????? Object...
    }
}
