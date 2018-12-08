package bytebank_herdado_conta;

public class TesteContas {

	public static void main(String[] args) {
	
		ContaCorrente cc = new ContaCorrente(1, 123456);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(1, 654321);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		SeguroDeVida segVida = new SeguroDeVida();
		
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		calc.registraImposto(cc);
		calc.registraImposto(segVida);
		
		System.out.println("Total imposto: " + calc.getTotalImposto());
	}
}