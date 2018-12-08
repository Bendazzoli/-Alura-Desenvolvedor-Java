package bytebank_herdado_conta;

public class CalculadoraDeImposto {
	
	private double totalImposto;
	
	public void registraImposto(Tributavel trib) {
		double valor = trib.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}
}
 