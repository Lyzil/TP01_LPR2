/*
 Nome: Luiz Gustavo Verissimo Monteiro
 Prontuário: CB3030326
*/

public class testAuthor
	{
		public static void main(String[] args) {
	
		Author autor = new Author("Luiz Gustavo", "email@gmail.com", 'M');
		System.out.println(autor.toString());
		
		autor.setEmail("new@gmail.com");
		System.out.println("\n"+autor.toString());
		
		System.out.println(
				autor.getName() + "\n" +
				autor.getEmail() + "\n" +
				autor.getGender()
		);
	}
}