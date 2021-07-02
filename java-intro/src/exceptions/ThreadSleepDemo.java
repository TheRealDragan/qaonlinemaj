package exceptions;

public class ThreadSleepDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Sad ce biti 5 sekundi izmedju ispisa");
		Thread.sleep(5000);
		System.out.println("Jesam vam rekao??");

	}

}
