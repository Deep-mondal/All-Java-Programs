import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Creat an array");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x = in.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                System.out.println("Data found");
                return;
            }
        }
        System.out.println("Data not found");
    }
}
