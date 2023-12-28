//R-1.4
public class tre {

        public static void main(String[] args) {
            int i = 10;
            boolean result = isEven(i);
            System.out.println(result);  // Output: true
        }

        public static boolean isEven(int i) {
            return (i & 1) == 0;
        }
    }

