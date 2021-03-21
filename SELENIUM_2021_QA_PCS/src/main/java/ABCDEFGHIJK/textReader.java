package ABCDEFGHIJK;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import javax.swing.text.html.HTML;

public class textReader {

	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
FileInputStream file=new FileInputStream("C:\\Users\\birr_\\Desktop\\mytext.txt");

		Scanner scan=new Scanner(file);
		while (scan.hasNext()) {
			System.out.print(" "+scan.next());
		}
		
		
		
//		FileWriter write= new FileWriter("C:\\Users\\birr_\\Desktop\\mydoc.txt");
//		Scanner s=new Scanner(System.in);
//		System.out.println("Pleased insert your test doc to save and will be saved at desktop");
//		String mydoc=s.nextLine();
//		write.write(mydoc);
//		write.close();
//		
		
		
		
		
		
		FileWriter w=new FileWriter("C:\\Users\\birr_\\Desktop\\mahi.txt");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the doc");
		String mahidoc=s.nextLine();
		w.write(mahidoc);
		w.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("----------------------------------------------");
//	
//		URL url = new URL("https://www.tutorialspoint.com/how-to-read-the-contents-of-a-webpage-into-a-string-in-java");
//		
//		Scanner scan2=new Scanner(url.openStream());
//		StringBuffer sb =new StringBuffer();
//		
//		while (scan2.hasNext()) {
//String x=String.valueOf(sb.append(scan2.next()));
////System.out.println(scan2.next());
//System.out.println("----------------------------------------------");
////System.out.println(x);
//
//		}
//		
//		String result = (sb.toString()).replaceAll("<[^>]*>", "");	
////		System.out.println(result);
//	
//		  HttpClient client = HttpClient.newHttpClient();
//	        HttpRequest request = HttpRequest.newBuilder()
//	                .uri(URI.create("http://www.google.com"))
//	                .GET() // GET is default
//	                .build();
//
//	        HttpResponse<String> response = client.send(request,
//	                HttpResponse.BodyHandlers.ofString());
//
////	        System.out.println(response.body());
//	  
//	        
//	        
//	        
//	
	}

}
