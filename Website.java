package mypack;
import java.util.*;
public class Website {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter website Link");
		String url=sc.nextLine();
websiteUrl(url);
	}
	public static void websiteUrl(String url) {
		String str[]=url.split(" / ");
		System.out.println(str[2]);
	}

}
