public class Author
{
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		gender = Character.toLowerCase(gender);
		if(gender == 'm' || gender == 'f')
			this.gender = gender;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getName(){ return this.name; }
	public String getEmail(){ return this.email; }
	public char getGender(){ return this.gender; }
	
	public String toString()
	{
		return "Author[name=" + name +",email="+ email +",gender="+ gender+"]";
	}
	
	public static void main(String [] args){
	
		Author autor = new Author("Luiz Gustavo", "email@gmail.com", 'M');
		System.out.println(autor.toString());
		Author autor1 = new Author("Luiz Felipe", "email1@gmail.com", 'j');
		System.out.println(autor1.toString());
		
		autor.setEmail("new@gmail.com");
		System.out.println("\n"+autor.toString());
		
		System.out.println("\nAutor 2: "+autor1.getEmail());
		System.out.println("Autor 2: "+autor1.getName());
		System.out.println("Autor 1: "+autor.getGender());
	}
}

	