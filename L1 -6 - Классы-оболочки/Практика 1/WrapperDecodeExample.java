public class WrapperDecodeExample {
    public static void main(String[] args) {
        String decimal = "42";
        String hex = "0x2A";
        String octal = "052";

        Integer decimalValue = Integer.decode(decimal);
        Integer hexValue = Integer.decode(hex);
        Integer octalValue = Integer.decode(octal);

        System.out.println("Decimal: " + decimalValue); // 42
        System.out.println("Hexadecimal: " + hexValue); // 42
        System.out.println("Octal: " + octalValue); // 42
    }
}
