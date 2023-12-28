//R-1.9
public class Builder {
        public static String removePunctuation(String s) {
            StringBuilder sb = new StringBuilder();

            for (char ch : s.toCharArray()) {
                if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
                    sb.append(ch);
                }
            }

            return sb.toString();
        }

        public static void main(String[] args) {
            String s = "Let’s try, Mike!";
            String result = removePunctuation(s);
            System.out.println(result); // Output: Lets try Mike
        }



}
