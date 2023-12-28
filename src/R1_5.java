//R-1.5
public class R1_5 {
    public static int sum(int n){
        int total =0;
        for (int i = 1; i <=n ; i++) {
            total=total+i;

        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}

