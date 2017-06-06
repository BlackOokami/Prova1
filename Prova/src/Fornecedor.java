
public class Fornecedor extends Pessoa {
	
	private double credimax;
	private double valoremdv;
	
	Fornecedor(){
		
	}
	
	public double getCredimax() {
		return credimax;
	}
	public void setCredimax(double credimax) {
		this.credimax = credimax;
	}
	public double getValoremdv() {
		return valoremdv;
	}
	public void setValoremdv(double valoremdv) {
		this.valoremdv = valoremdv;
	}
	
	public void obtersaldo(double dife){
		credimax +=dife;
		valoremdv += dife;
	}
	
	
}
