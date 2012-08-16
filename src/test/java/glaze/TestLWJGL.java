package glaze;

import static org.junit.Assert.*;
import org.junit.Test;


import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class TestLWJGL {
	
	@Test public void testLWJGL() {
		try {
			Display.setDisplayMode(new DisplayMode(800,600));
			Display.create();
		} catch (LWJGLException e) {
			throw new Error(e);
		}
		Display.destroy();
	}

}
