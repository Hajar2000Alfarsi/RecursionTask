public class CountXDemo {
    public static void main(String[] args) {
        CountX countX = new CountX();

        int result1 = countX.countX("xxhixx");
        int result2 = countX.countX("xhixhix");
        int result3 = countX.countX("hi");

        System.out.println("countX(\"xxhixx\") -->" + result1);
        System.out.println("countX(\"xhixhix\") -->" + result2);
        System.out.println("countX(\"hi\") -->" + result3);

    }
}
