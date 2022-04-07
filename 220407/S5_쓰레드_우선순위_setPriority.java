package lecture0407;

public class S5_������_�켱����_setPriority {
//�������� �켱���� ����
	public static void main(String[] args) {
		Thread thread1 = new MutiThreadTest("[ Thread " + 1 + " ]");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		Thread thread2 = new MutiThreadTest("[ Thread " + 2 + " ]");
		thread1.setPriority(Thread.MAX_PRIORITY);	//�� �������� �켱������ �ֿ켱������ ����.
		thread2.start();
	}
}


//������ Ŭ����
class MutiThreadTest extends Thread {
	public MutiThreadTest(String threadName) {
		this.setName(threadName); // setName() : �� �������̸��� threadName �� ���� ���Ѵ�.
	}

	//Thread������ ���� �⺻ �޼ҵ� run()
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// getName() : �� �������� �̸��� ��ȯ�Ѵ�.
		System.out.println(this.getName() + " Thread_Start");
	}
}


/*
<���>
[ Thread 1 ] Thread_Start
[ Thread 2 ] Thread_Start
*/