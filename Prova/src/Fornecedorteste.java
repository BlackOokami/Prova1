
public class Fornecedorteste {

	public static void main(String[] args) {
		
		Fornecedor fe = new Fornecedor();
		
		fe.setNome("Do posto");
		fe.setCredimax(1500);
		fe.setValoremdv(500);
		System.out.println("Fornecedor=> Nome: "  + fe.getNome() + " Credito maximo "  + fe.getCredimax() +" Valor em divida " + fe.getValoremdv());
	
	
	
	}

}
