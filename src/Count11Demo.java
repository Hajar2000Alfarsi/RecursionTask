public class Count11Demo {
    public static void main(String[] args) {
        Count11 count11 = new Count11();

        int result1 = count11.count11("11abc11");
        int result2 = count11.count11("abc11x11x11");
        int result3 = count11.count11("111");

        System.out.println("count11(\"11abc11\") → " + result1);
        System.out.println("count11(\"abc11x11x11\") → " + result2);
        System.out.println("count11(\"111\") → " + result3);
    }
}
