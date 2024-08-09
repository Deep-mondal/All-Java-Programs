package basicPackage;

public class ThreadCreate extends Thread {
	public void run() {
		System.out.print("Hello World");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCreate ob=new ThreadCreate();
		ob.start();
	}

}
