public class CountHiDemo {
    public static void main(String[] args) {
        CountHi countHi = new CountHi();

        int result1 = countHi.countHi("xxhixx");
        int result2 = countHi.countHi("xhixhix");
        int result3 = countHi.countHi("hi");

        System.out.println("countHi(\"xxhixx\") → " + result1);
        System.out.println("countHi(\"xhixhix\") → " + result2);
        System.out.println("countHi(\"hi\") → " + result3);

    }
}
