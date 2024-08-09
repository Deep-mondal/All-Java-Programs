import java.util.*;
public class SwapWithOutVar {
    public static void main(String[] a){
        System.out.print("x");
        int x=(new Scanner(System.in)).nextInt();
        System.out.print("y");
        int y=(new Scanner(System.in)).nextInt();
        System.out.println("before swapping"+" "+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping"+" "+x+" "+y);
    }
}
