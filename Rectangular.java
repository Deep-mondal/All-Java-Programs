import java.util.Scanner;

public class Rectangular {
    // int breadth;
    // int length;

    void area(int breadth, int length) {
        System.out.println(breadth * length);
    }

    void parameter(int breadth, int length) {
        System.out.println(2 * (breadth + length));
    }

    public static void main(String[] args) {
        Rectangular abcd = new Rectangular();
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the Breadth");
        int a = take.nextInt();
        System.out.println("Enter the Length");
        int b = take.nextInt();
        abcd.area(a, b);
        abcd.parameter(a, b);
    }
}
