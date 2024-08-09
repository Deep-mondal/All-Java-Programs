//Abstraction
abstract class Parent{
	void display(){
		System.out.println("Pareent class called");
	}
	abstract void prnt();
}
class Child extends Parent{
	void prnt(){
		System.out.println("Abstract method called");
	}
	public static void main(String[] a){
		new Child().display();
		new Child().prnt();
	}
	
}
