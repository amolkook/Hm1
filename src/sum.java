//R-1.5
public class sum {


//    public static void main(String[] args) {
//        int n = 5;
//        int result = sumPositiveIntegers(n);
//        System.out.println(result);  // Output: 15
//    }
//
//    public static int sumPositiveIntegers(int n) {
//        if (n <= 0) {
//            return 0;
//        }
//
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//
//        return sum;
//    }
//}

    public static int sumOfPositiveIntegers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sumOfPositiveIntegers(n);
        System.out.println(result); // Output: 15
    }
}
