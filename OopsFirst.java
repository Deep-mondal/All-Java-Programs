public class OopsFirst {
    String name;

    public void eat() {
        System.out.println("I am eating" + name);
    }

    public static void main(String[] args) {
        OopsFirst eating = new OopsFirst();
        eating.name = "Rice";
        eating.eat();

    }
}
