public class ChangePiDemo {
    public static void main(String[] args) {
        ChangePi changePi = new ChangePi();

        String result1 = changePi.changePi("xpix");
        String result2 = changePi.changePi("pipi");
        String result3 = changePi.changePi("pip");

        System.out.println("changePi(\"xpix\") = " + result1);
        System.out.println("changePi(\"pipi\") = " + result2);
        System.out.println("changePi(\"pip\") = " + result3);
    }
}
