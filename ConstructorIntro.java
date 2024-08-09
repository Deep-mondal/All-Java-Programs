public class ConstructorIntro {
    int a,b;
    ConstructorIntro(){
        a=10;
        b=20;
    }
    void display(){
        System.out.println(a+" "+b);
    }
}
 class MainMenu{
    public static void main(String[] a){
        ConstructorIntro ob=new ConstructorIntro();
        ob.display();
    }
}