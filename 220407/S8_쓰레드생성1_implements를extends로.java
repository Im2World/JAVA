package lecture0407;

public class S8_쓰레드생성1_implements를extends로 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		S8_쓰레드생성1_implements를extends로 main = new S8_쓰레드생성1_implements를extends로();
		Thread thread = new Thread(main);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
	}
}
