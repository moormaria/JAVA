public class StringConversions {
    public static void main(String[] args) {
        // ?????????????? String -> StringBuffer
        String str = "Hello";
        StringBuffer buffer = new StringBuffer(str);
        System.out.println("StringBuffer: " + buffer);

        // ?????????????? StringBuffer -> String
        String strFromBuffer = buffer.toString();
        System.out.println("String ?? StringBuffer: " + strFromBuffer);

        // ?????????????? String -> StringBuilder
        StringBuilder builder = new StringBuilder(str);
        System.out.println("StringBuilder: " + builder);

        // ?????????????? StringBuilder -> String
        String strFromBuilder = builder.toString();
        System.out.println("String ?? StringBuilder: " + strFromBuilder);

        // ?????????????? StringBuffer -> StringBuilder
        StringBuilder builderFromBuffer = new StringBuilder(buffer);
        System.out.println("StringBuilder ?? StringBuffer: " + builderFromBuffer);

        // ?????????????? StringBuilder -> StringBuffer
        StringBuffer bufferFromBuilder = new StringBuffer(builder);
        System.out.println("StringBuffer ?? StringBuilder: " + bufferFromBuilder);
    }
}
