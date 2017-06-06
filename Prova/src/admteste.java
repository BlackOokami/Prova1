
public class admteste {

	public static void main(String[] args) {
		
		Adm a = new Adm();
		
		a.setNome("Pedro");
		a.setSalario(1000);
		a.obterlucro();
		System.out.println("Funcionario => Nome: " + a.getNome() + " Salario: " + a.getSalario());
		
	}

}
