package mypack;
import java.util.*;
public class WebsiteSecure {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter URL:");
		String url=sc.nextLine();
		checkingUrl(url);
		
		}	
		public static void checkingUrl(String url) {
		if(url.contains("https")&& url.startsWith("https")) {
			System.out.println("Website is Secure");
			
		}
		else  {
			System.out.println("Website Not Secure");
			
		}
		}
}


