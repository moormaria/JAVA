public class StringBufferStringBuilderDemo {
    public static void main(String[] args) {
        // ???????????? StringBuffer
        StringBuffer buffer = new StringBuffer("Hello");

        // 1. append() - ????????? ?????? ? ?????
        buffer.append(", World!");
        System.out.println("????? append: " + buffer);

        // 2. insert() - ????????? ?????? ? ????????? ???????
        buffer.insert(5, " Java");
        System.out.println("????? insert: " + buffer);

        // 3. delete() - ??????? ?????????
        buffer.delete(5, 10);
        System.out.println("????? delete: " + buffer);

        // 4. reverse() - ????????????? ??????
        buffer.reverse();
        System.out.println("????? reverse: " + buffer);

        // 5. replace() - ???????? ????? ??????
        buffer.replace(0, 5, "Hi");
        System.out.println("????? replace: " + buffer);

        // ???????????? StringBuilder
        StringBuilder builder = new StringBuilder("Java");

        // 6. append() - ????????? ?????? ? ?????
        builder.append(" Programming");
        System.out.println("????? append: " + builder);

        // 7. capacity() - ?????????? ??????? ??????? ??????
        System.out.println("??????? ??????: " + builder.capacity());

        // 8. ensureCapacity() - ??????????? ??????? ??????
        builder.ensureCapacity(50);
        System.out.println("??????? ????? ensureCapacity: " + builder.capacity());

        // 9. substring() - ????????? ????? ??????
        System.out.println("?????????: " + builder.substring(0, 4));

        // 10. length() - ?????????? ????? ??????
        System.out.println("????? ??????: " + builder.length());
    }
}
