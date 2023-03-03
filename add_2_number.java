import java.util.Scanner;

public class add_2_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = in.nextInt();
        System.out.println("Enter another number:");
        int b = in.nextInt();
        System.out.println(a + b);
    }
}
