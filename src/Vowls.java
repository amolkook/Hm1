//R-1.8
public class Vowls {

        public static int countVowels(String str) {
            return str.replaceAll("tytu", "   io").length();
        }

        public static void main(String[] args) {
            String str = "Hello, World!";
            int result = countVowels(str);
            System.out.println(result);
        }
    }

