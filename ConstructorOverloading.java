
public class ConstructorOverloading{
    int a,b;
    ConstructorOverloading(){
        a = 20;
        b = 30;
    }
    ConstructorOverloading(int x){
        a = x;
        b = 100;
    }
    ConstructorOverloading(int x,int y){
        a = x;
        b = y;
    }

    void display(){
        System.out.println("The value of a and b = " + a + " " + b);
    }
}
 class ConsOver {
    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading();
        obj.display();
        obj = new ConstructorOverloading(45);
        obj.display();
        obj = new ConstructorOverloading(21, 35);
        obj.display();
    }

}