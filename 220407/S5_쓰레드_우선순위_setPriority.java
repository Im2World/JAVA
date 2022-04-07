package lecture0407;

public class S5_쓰레드_우선순위_setPriority {
//쓰레드의 우선순위 조정
	public static void main(String[] args) {
		Thread thread1 = new MutiThreadTest("[ Thread " + 1 + " ]");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		Thread thread2 = new MutiThreadTest("[ Thread " + 2 + " ]");
		thread1.setPriority(Thread.MAX_PRIORITY);	//이 쓰레드의 우선순위를 최우선순위로 설정.
		thread2.start();
	}
}


//쓰레드 클래스
class MutiThreadTest extends Thread {
	public MutiThreadTest(String threadName) {
		this.setName(threadName); // setName() : 이 쓰레드이름을 threadName 로 새로 정한다.
	}

	//Thread실행을 위한 기본 메소드 run()
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// getName() : 이 쓰레드의 이름을 반환한다.
		System.out.println(this.getName() + " Thread_Start");
	}
}


/*
<출력>
[ Thread 1 ] Thread_Start
[ Thread 2 ] Thread_Start
*/