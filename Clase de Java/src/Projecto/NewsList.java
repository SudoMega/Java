package Projecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class NewsList {

	private  ArrayList<News> list;
	
	
    //CONSTRUCTOR VACIO
    public NewsList(){
        list = new ArrayList<News>();
    }
    
    public void AddNews(News news) {  
		
		list.add(news);
	}
    
    public String[] leerFeed() {
    try {
    	
        URL url = new URL("https://www.pcgamer.com/news/");
       	BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        	String line;
        	String todo[] = new String [30];
        	int i=0;
        	while((line = in.readLine())!=null) {
        		if(line.contains("<h3 class=\"article-name\">")) {
        			int firstPos = line.indexOf("<h3 class=\"article-name\">");
        					String temp = line.substring(firstPos);
        					temp = temp.replace("<h3 class=\"article-name\">","");
        					int lastPos = temp.indexOf("</h3>");
        					temp = temp.substring(0, lastPos);
        					todo[i] = temp;
        					i++;
        					
    		
    	}
    	
    	
    }
        	in.close();
        	return todo;
    }
    catch (MalformedURLException ue) {
    }
    catch (IOException e) {	
    }
    
    return null;
}
    public String[] Urls() {
    try {
    	
        URL url = new URL("https://www.pcgamer.com/news/");
       	BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        	String line;
        	String todo[] = new String [1000];
        	int i=0;
        	while((line = in.readLine())!=null) {
        		if(line.contains("> <a href=")) {
        			int firstPos = line.indexOf("> <a href=");
        					String temp = line.substring(firstPos);
        					temp = temp.replace("> <a href=","");
        					int lastPos = temp.indexOf("/\">");
        					temp = temp.substring(0, lastPos);
        					todo[i] = temp;
        					i++;

        					
    		
    	}
    	
    	
    }
        	in.close();
        	return todo;
    }
    catch (MalformedURLException ue) {
    }
    catch (IOException e) {	
    }
    
    return null;
}
    }
