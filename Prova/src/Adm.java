
public class Adm extends Empregado {
	
	private double ajudasDeCusto = 500;
	
	Adm(){
		
	}

	
	public void obterlucro() {
		setSalario(getSalario() + ajudasDeCusto );
		
	}
	
	
	
	
}


