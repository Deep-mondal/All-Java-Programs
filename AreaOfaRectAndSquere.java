public class AreaOfaRectAndSquere{
    void area(int x){
        System.out.println("The area of the square = "+ (x*x));
    }
    void area(int x,int y){
        System.out.println("The area of the rectangle = " + (x*y));
    }
}
 class Code {
    public static void main(String[] args) {
        AreaOfaRectAndSquere obj = new AreaOfaRectAndSquere();
        obj.area(20);
        obj.area(20, 15);
    }

}