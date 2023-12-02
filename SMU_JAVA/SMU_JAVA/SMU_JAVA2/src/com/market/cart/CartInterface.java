package com.market.cart;
import com.market.bookitem.Book;
import java.util.ArrayList;


public interface CartInterface {
	void printBookList(ArrayList<Book> p);
	boolean isCartInBook(String id);
	void insertBook(Book p);
	void removeCart(int numId);
	void deleteBook();
}