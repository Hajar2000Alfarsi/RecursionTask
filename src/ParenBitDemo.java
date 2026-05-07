public class ParenBitDemo {
    public static void main(String[] args) {
        ParenBit parenBit = new ParenBit();

        String result1 = parenBit.parenBit("xyz(abc)123");
        String result2 = parenBit.parenBit("x(hello)");
        String result3 = parenBit.parenBit("(xy)1");

    }
}
