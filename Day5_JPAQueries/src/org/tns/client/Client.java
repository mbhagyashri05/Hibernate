package org.tns.client;

import java.util.Scanner;

import org.tns.entites.Book;
import org.tns.services.BookService;
import org.tns.services.BookServiceImpl;


public class Client {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		BookService service=new BookServiceImpl();
		
		
		System.out.println("Listing book with Specific ID: ");
		System.out.println("Enter the Book ID:");
		int id=s.nextInt();
		System.out.println("Book with ID "+id+":"+service.getBookById(id));

		
		System.out.println("Listing book with Specific Title: ");
		System.out.println("Enter the title:");
		String title=s.next();
		System.out.println("Book with Specific "+title+":"+service.getBookByTitle(title));
		
		System.out.println("Listing book with Specific author: ");
		System.out.println("Enter the author name:");
		String author=s.nextLine();
		System.out.println("Book with Specific "+author+":"+service.getAuthorBooks(author));
		
		System.out.println("Listing book with Specific price range: ");
		for(Book book:service.getBookInPriceRange(300.0, 600.0))
			System.out.println(book);
		
		
		System.out.println("Listing all the books: ");
		System.out.println(service.getAllBooks());
		
	}

}