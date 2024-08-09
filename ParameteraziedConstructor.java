import java.util.*;
public class ParameteraziedConstructor {
    int a,b;
    ParameteraziedConstructor(int x,int y){
        a=x;
        b=y;
    }
    void display(){
        System.out.println(a+" "+b);
    }
}
class ParameteraziedConstructor1{
    public static void main(String[] a){
        ParameteraziedConstructor ob=new ParameteraziedConstructor(50,20);
        //Scanner in=new Scanner(System.in);

        ob.display();
    }
}