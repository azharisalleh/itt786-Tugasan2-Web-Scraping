package curl;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * This program for:
 * Data Scraping Using Jsoup 
 * Target URL: http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html.
*/
/*
 * author : Azhari Hj Salleh
 * matrix no : 201461166
 * email : azhari.salleh@gmail.com
 * github acct : https://github.com/azharisalleh
 * 
 */

public class JsoupAdvanced {

	public static void main(String[] args) {
		Document doc;
		try{
			doc = Jsoup.connect("http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html").get();
			
			String title = doc.title();  
            System.out.println("Title is: " + title);
			            
            String keywords = doc.select("meta[name=keywords]").first().attr("content");  
            System.out.println("Meta keyword : " + keywords);  
            String description = doc.select("meta[name=description]").get(0).attr("content");  
            System.out.println("Meta description : " + description); 
            
        	// get all links
    		Elements links = doc.select("a[href]");
    		for (Element link : links) {

    			// get the value from href attribute
    			System.out.println("\nlink : " + link.attr("href"));
    			System.out.println("text : " + link.text());

    		}
            
		}catch(IOException e){
			
		}

	}

}
