public class StrCopiesDemo {
    public static void main(String[] args) {
`       StrCopies strCopies = new StrCopies();

        boolean result1 = strCopies.strCopies("catcowcat", "cat", 2);
        boolean result2 = strCopies.strCopies("catcowcat", "cow", 2);
        boolean result3 = strCopies.strCopies("catcowcat", "cow", 1);

        System.out.println("strCopies(\"catcowcat\", \"cat\", 2) → " + result1);
        System.out.println("strCopies(\"catcowcat\", \"cow\", 2) → " + result2);
        System.out.println("strCopies(\"catcowcat\", \"cow\", 1) → " + result3);

    }
}
