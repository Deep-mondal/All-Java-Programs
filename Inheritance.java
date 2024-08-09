//Inheritance
class Parent{
	void display(){
		System.out.println("Pareent class called");
	}
}
class Child extends Parent{
	public static void main(String[] a){
		new Child().display();
	}
}