import java.io.File;

import com.bmpl.module.FirstClass;

import jaco.mp3.player.MP3Player;

public class SecondClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FirstClass cls = new FirstClass();
		cls.print();
		A obj = new A();
		//c:\\xyz\\abcd\\S.mp3
		//File path = new File("/Users/amit/Documents/songs/S.mp3");
		MP3Player mp3 = new MP3Player(SecondClass.class.getResource("S.mp3"));
		mp3.play();
		Thread.sleep(5000);
		mp3.stop();
	// main is running and it is treated as Thread
		// Code in Execution is called Thread
		
		

	}

}
