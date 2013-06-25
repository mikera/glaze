package glaze;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.Test;


import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class TestLWJGL {
	
	public void resetLibaryPath() {
		File temp=null;
		try {
			temp = File.createTempFile("natives","");
			temp.delete();
			temp.mkdir();
			temp.deleteOnExit();
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.setProperty( "java.library.path", temp.getAbsolutePath() );
		 
		Field fieldSysPath;
		try {
			fieldSysPath = ClassLoader.class.getDeclaredField( "sys_paths" );
			fieldSysPath.setAccessible( true );
			fieldSysPath.set( null, null );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static {
		// resetLibaryPath();
	}
	
	@Test public void testLWJGL() {
		
		System.out.println("LIBRARY PATH: "+System.getProperty("java.library.path"));
		
		try {
			Display.setDisplayMode(new DisplayMode(800,600));
			Display.create();
		} catch (LWJGLException e) {
			throw new Error(e);
		}
		Display.destroy();
	}

}
