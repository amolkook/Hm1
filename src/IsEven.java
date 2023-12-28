//R-1.4
public class IsEven {

        public static boolean isEven(int i) {
            return (i & 1) == 0;
        }

        public static void main(String[] args) {
            int i = 6;
            boolean result = isEven(i);
            System.out.println(result); // Output: true
        }
    }

