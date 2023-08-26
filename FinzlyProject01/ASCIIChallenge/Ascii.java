
public class Ascii {
    public static void main(String[] args) {
        String result;

        result = ASCIIConversion("dog");
        System.out.println(result);

        result = ASCIIConversion("hello world");
        System.out.println(result);

        result = ASCIIConversion("abc **");
        System.out.println(result);
    }

    public static String ASCIIConversion(String str) {
        String result = "";

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == ' ') {
                    result += c; 
                } else {
                    intValue = (int) c;
                    result += String.valueOf(Value);
                }
            }

        return result;
    }
}
