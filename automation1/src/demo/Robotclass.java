package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class Robotclass {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		Runtime.getRuntime().exec("notepad");
	Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		}
	}


