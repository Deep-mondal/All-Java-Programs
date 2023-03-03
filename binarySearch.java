import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter" + " " + arr.length + " " + "Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        bubbleSort(arr);
        System.out.println("Enter the element to be searched");
        int x = in.nextInt();
        bSearch(arr, 0, arr.length - 1, x);
    }

    static void bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static void bSearch(int[] a, int s, int e, int x) {
        int mid = (a.length / 2);
        // System.out.println("Enter the element to be searched");
        // Scanner in = new Scanner(System.in);
        // int x = in.nextInt();
        if (x == a[mid]) {
            System.out.println("Data found");
            return;
        }
        if (x < a[mid]) {
            bSearch(a, 0, mid - 1, x);
        }
        if (x > a[mid]) {
            bSearch(a, mid + 1, a.length - 1, x);
        }
    }
}
