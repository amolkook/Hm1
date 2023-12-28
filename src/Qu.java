import java.util.Scanner;

public class Qu {
    public static void main(String[] args) {
        //1
        System.out.println("hello world");
        //------------------------------
        //2
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //-------------------------------
        //3
        String[] a = {"e", "r", "n"};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //--------------------------------
        //4
        int num[] = new int[4];
        Scanner input = new Scanner(System.in);
        for (int t = 0; t < num.length; t++) {
            num[t]=input.nextInt();


        }

    }


    }

