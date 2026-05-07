public class ParenBitDemo {
    public static void main(String[] args) {
        ParenBit parenBit = new ParenBit();

        String result1 = parenBit.parenBit("xyz(abc)123");
        String result2 = parenBit.parenBit("x(hello)");
        String result3 = parenBit.parenBit("(xy)1");

        System.out.println("parenBit(\"xyz(abc)123\") → " + result1);
        System.out.println("parenBit(\"x(hello)\") → " + result2);
        System.out.println("parenBit(\"(xy)1\") → " + result3);
    }
}
