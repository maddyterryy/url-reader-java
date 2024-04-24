package fileIO;
//the following small Java program uses openStream() to get an input stream on the given URL
//it returns the raw HTML from a page by copying what is read on the input stream to the standard output stream
import java.net.*;
import java.io.*;
import java.util.*;

public class URLreader {
	public static void main(String [] args) throws Exception{
		try {
		//creates URL object representing the target URL
		URL url = new URL("https://open.spotify.com/");
		
		//creates a new BufferedReader object named 'in' and initializes with a FileReader object
		//BufferedReader is used to efficiently read text from a character-input stream
		//and FileReader reads characters from a file in the file system
		//we pass 'filePath' as an argument to the FileReader constructor
		BufferedReader in = new BufferedReader(
		new InputStreamReader(url.openStream()));
		
		
		String inputLine;
		//while the url has next line, print each line
		while((inputLine = in.readLine()) != null){
			System.out.println(inputLine);
		}
		//close the BufferedReader
		in.close();
		}
		//catch block to print and diagnose exceptions
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}
