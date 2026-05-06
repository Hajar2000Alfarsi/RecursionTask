public class PairStar {
    public String pairStar(String str){
        if (str.length()  <= 1) {
            return str;
        }

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);

        if (firstChar == secondChar) {
            return firstChar + "*" + pairStar(str.substring(1));
        }

        return firstChar + pairStar(str.substring(1));
    }
}
