class Overloading{
    void display(){
        System.out.println("No arguments passed");
    }
    void display(int x){
        System.out.println("Value of x = " + x);
    }
    void display(int x,int y){
        System.out.println("The values of x and y = " + x + " " + y);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.display();
        obj.display(67);
        obj.display(4, 5);
    }

}
