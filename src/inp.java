//R-1.1
import java.util.Scanner;

public class inp {
   public int n ;
  public double r;
  public float e;

    public inp(int n, double r, float e) {
        this.n = n;
        this.r = r;
        this.e = e;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        inp input = new inp(intValue, doubleValue, floatValue);

        System.out.println("Integer value: " + input.n);
        System.out.println("Double value: " + input.r);
        System.out.println("Float value: " + input.e);

        scanner.close();
    }
}
