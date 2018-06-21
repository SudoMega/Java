package Projecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//news id, fecha hora, header, url, subtitulo

public class News {

	private int id;
	private String header;
	private String body;
	private URL url;
	private String initialDate;
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	
	  public News(int newsId, String header, String body, URL url) {
			id = newsId;
			initialDate = dateFormat.format(date);
			this.header = header;
			this.body = body;
			this.url = url;
		}
	
	  
	public static void ReadNews() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("X:\\WorkPlace\\Java\\NewsText\\News.txt"));		
		
		String sCurrentLine;
		
		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		}
		br.close();
	}
	
	public String GetHeader() {
		return header;
	}
	public String GetBody() {
		return body;
	}
	public URL GetUrl() {
		return url;
	}
	public String GetDate() {
		return initialDate;
	}
	
}
