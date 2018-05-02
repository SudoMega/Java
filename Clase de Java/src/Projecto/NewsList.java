package Projecto;

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
    
    
}
