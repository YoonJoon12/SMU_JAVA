package com.market.bookitem;
public abstract class Item {
	String bookId;
	String name;
	int unitPrice;
	
	public Item(String bookId, String name, int unitPrice) {
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	abstract String getBookId();
	
	abstract String getName();
	
	abstract int getUnitPrice();
	
	abstract void setBookId(String name);
	
	abstract void setName(String name);
	
	abstract void setUnitPrice(int unitPrice);
}