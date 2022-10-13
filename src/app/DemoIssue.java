package app;

public class DemoIssue {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {			
			@Override
			public void run() {
				AndroidCamera.getAndroidCamera().takePicture();				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {			
			@Override
			public void run() {
				AndroidCamera.getAndroidCamera().takePicture();				
			}
		});
		
		t1.start();
		t2.start();
	}

}
