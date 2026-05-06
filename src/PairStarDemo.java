public class PairStarDemo {
    public static void main(String[] args) {
        PairStar pairStar = new PairStar();

        String result1 = pairStar.pairStar("hello");
        String result2 = pairStar.pairStar("xxyy");
        String result3 = pairStar.pairStar("aaaa");

        System.out.println("pairStar(\"hello\") = " + result1);
        System.out.println("pairStar(\"xxyy\") = " + result2);
        System.out.println("pairStar(\"aaaa\") = " + result3);
    }
}
