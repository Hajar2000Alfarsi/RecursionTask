public class StrCountDemo {
    public static void main(String[] args) {
        StrCount strCount = new StrCount();

        int result1 = strCount.strCount("catcowcat", "cat");
        int result2 = strCount.strCount("catcowcat", "cow");
        int result3 = strCount.strCount("catcowcat", "dog");

        System.out.println("strCount(\"catcowcat\", \"cat\") → " + result1);
        System.out.println("strCount(\"catcowcat\", \"cow\") → " + result2);
        System.out.println("strCount(\"catcowcat\", \"dog\") → " + result3);
    }
}
