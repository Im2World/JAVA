package lecture0407;

public class S8_���������2_implements_Runnable implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		S8_���������2_implements_Runnable main = new S8_���������2_implements_Runnable();
		Thread thread = new Thread(main);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
	}
}
