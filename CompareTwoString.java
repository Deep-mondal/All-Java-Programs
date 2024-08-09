import  java.util.*;
//import java.lang.String;
public class CompareTwoString {
    public static void main(String [] a){
        System.out.print("Enter first string");
        String s1=(new Scanner(System.in)).nextLine();
        System.out.print("Enter Second string");
        String s2=(new Scanner(System.in)).nextLine();
        if(s1.compareTo(s2)>0)
            System.out.println("First String is greater");
        else if(s1.compareTo(s2)<0)
            System.out.println("Second String is greater");
        else
            System.out.print("Both are same");
    }
}
