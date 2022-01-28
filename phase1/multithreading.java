package core.programs.assissted.project;
class TestSleep implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=50; i++) {
			try {
				Thread.sleep(1000);
			
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
}
	


class TestSleep1 implements Runnable {

	@Override
	public void run() {
		for(int i=51; i<=100; i++) {
			try {
				
				Thread.sleep(1000);
			
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	
}


public class sleepexample {

	public static void main(String[] args) {

		Thread t1 = new Thread(new TestSleep());
		Thread t2 = new Thread(new TestSleep1());
		
		
		t1.start();
		
		t2.start();
	
		

	}

}
	

