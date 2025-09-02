public class StudentStaffTest
{
		public static void main(String[] args) {
		
		Person luiz = new Person("Luiz Julio", "vazio");
        System.out.println("Nome original: "+luiz.getName());
        System.out.println("Endereco original: "+luiz.getAddress());
        luiz.setAddress("Av. A, 456");
        System.out.println(luiz.toString());
		
		Student studante = new Student("Maria", "Av. B, 789", "ADS", 2, 29.99);

        System.out.println("Programa original: "+studante.getProgram());
        System.out.println("Ano original: "+studante.getYear());
        System.out.println("Taxa original: "+studante.getFee());
        studante.setProgram("Engenharia");
        studante.setYear(5);
        studante.setFee(33.33);
        System.out.println(studante.toString());

        Staff funcionario = new Staff("Pedro", "Av. C, 123", "SENAI", 2900.50);
        
        System.out.println("Escola original: "+funcionario.getSchool());
        System.out.println("Salario original: "+funcionario.getPay());
        funcionario.setSchool("IFSP");
        funcionario.setPay(3000.00);
        System.out.println(funcionario.toString());
    }    
}