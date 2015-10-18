package curl;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * This program for:
 * Data Scraping Using Jsoup (Array Format) 
 * Target URL: http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html.
*/
/*
 * author : Azhari Hj Salleh
 * matrix no : 201461166
 * email : azhari.salleh@gmail.com
 * github acct : https://github.com/azharisalleh
 * 
 */

public class Curl {

	public static void main(String[] args) {
		Document doc;
		try{
			doc = Jsoup.connect("http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html").get();
			String Title = doc.title();
			System.out.println("Title of the page "+ Title);
			
			Elements urls = doc.select("a");
			
			for(Element url:urls){
				System.out.println("\nHref Tag <a>: " + url.attr("href"));
				System.out.println("\nHref Tag <a>: " + url.text() );
				
			}
			
			
		}catch(IOException e){
			
		}

	}

}
