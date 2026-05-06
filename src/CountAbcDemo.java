public class CountAbcDemo {
    public static void main(String[] args) {
        CountAbc countAbc = new CountAbc();

        int result1 = countAbc.countAbc("abc");
        int result2 = countAbc.countAbc("abcxxabc");
        int result3 = countAbc.countAbc("abaxxaba");

        System.out.println("countAbc(\"abc\") = " + result1);
        System.out.println("countAbc(\"abcxxabc\") = " + result2);
        System.out.println("countAbc(\"abaxxaba\") = " + result3);
    }
}
