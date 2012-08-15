package glaze;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.*;

public class TestApp {

	public void start() {
		try {
			Display.setDisplayMode(new DisplayMode(800,600));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		// init OpenGL here
		
		while (!Display.isCloseRequested()) {
			
			// render OpenGL here
			
			Display.update();
		}
		
		Display.destroy();
	}
	
	public static void main(String[] args) {
		TestApp app = new TestApp();
		app.start();
	}

}
