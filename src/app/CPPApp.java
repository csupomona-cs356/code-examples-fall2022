package app;

public class CPPApp {

	public static void main(String[] args) {
		AndroidCamera.getAndroidCamera().takePicture();
		
		AndroidCamera.getAndroidCamera().takePicture();
		AndroidCamera.getAndroidCamera().reset();
	}

}
