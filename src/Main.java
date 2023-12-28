
//long n = 15;
//        long m = 3;
//        boolean result = isMultiple(n, m);
//        System.out.println(result);  // الناتج: true
//    }
//
//    public static boolean isMultiple(long n, long m) {
//        return n % m == 0;
//    }

//R-1.3:
public class Main {
    public static void main(String[] args) {
//

        isMultiple(20,10);
        System.out.println(isMultiple(5,10));
    }
    public static boolean isMultiple(long n,long m)
    {
        if(n%m==0)
            return true;
        else
            return false;

    }

}
//-----------------------------------------

