/*
 Nome: Luiz Gustavo Verissimo Monteiro
 Prontuário: CB3030326
*/

public class BookTest
	{
		public static void main(String[] args) {
	
		Author[] authors = new Author[2];
		authors[0] = new Author("Pedro Nascimento", "pedronasc@gmail.com", 'm');
		authors[1] = new Author("Luiz Julio", "luizjulio@gmail.com", 'm');
		
		Book testBook = new Book("Java for noobies", authors, 29.99, 99);
		System.out.println(testBook.toString());
	}
}