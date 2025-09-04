/*
 Nome: Luiz Gustavo Verissimo Monteiro
 Prontuário: CB3030326
*/

import java.util.Arrays;

public class Book{
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author[] authors, double price)
	{
		this.name = name;
		this.authors = authors;
		this.price = price;
		qty++;
	}
	
	public Book(String name, Author[] authors, double price, int qty)
	{
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public void setPrice(double price){ this.price = price;}
	public void setQty(int qty){ this.qty = qty;}
	
	
	public String getName(){ return this.name; }
	public Author[] getAuthors(){ return this.authors; }
	public double getPrice(){ return this.price; }
	public int getQty(){ return this.qty; }
	
	public String toString()
	{
		return "Book[name=" + this.name +",authors={"+ Arrays.toString(this.authors)+"},price="+ this.price+ ",qty=" + this.qty + "]";
	}
	
	public String getAuthorNames()
	{
		String autores = "";
		
		for(int i = 0; i < authors.length; i++)
		{
			autores += (authors[i].getName() +",");
		}
		return autores;
	}
}