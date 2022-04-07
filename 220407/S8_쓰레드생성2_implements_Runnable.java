package lecture0407;

public class S8_쓰레드생성2_implements_Runnable implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		S8_쓰레드생성2_implements_Runnable main = new S8_쓰레드생성2_implements_Runnable();
		Thread thread = new Thread(main);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
	}
}
