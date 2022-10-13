package app;

public class AndroidCamera {
	
	private static AndroidCamera cameraInstance;
	
	private String name = "Default";
	
	public static AndroidCamera getAndroidCamera() {
		// lazy loading
		if (cameraInstance == null) {
			synchronized(AndroidCamera.class) {
				if (cameraInstance == null) {
					cameraInstance = new AndroidCamera();
					System.out.println("See null camera. Creating a new camera. " + cameraInstance);
				}				
			}
		}
		return cameraInstance;
	}
	
	private AndroidCamera() {
		System.out.println("Constructor()");		
	}
	
	public void takePicture() {
		System.out.println("Taking a picture from the Android camera ...");
	}
	
	public void reset() {
		System.out.println("Resetting the camera ...");
	}
}
