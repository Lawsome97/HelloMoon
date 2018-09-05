package url;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		String link = "https://www.youtube.com/watch?v=6hzrDeceEKc";
		File out = new File("C:\\Users\\anina\\Desktop\\YT3.mp4");
		
		new Thread(new Download(link, out)).start();
		
	
	}

}
