public class ParenBit {
    public String parenBit(String str) {
        if (str.startsWith("(") && str.endsWith(")")) {
            return str;
        }

        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        }
    }
}
