package bytebank_herdado;

public class TesteSistema {

	public static void main(String[] args) {
		
		SistemaInterno sistema = new SistemaInterno();
		
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		sistema.autentica(gerente);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(1111);
		sistema.autentica(cliente);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		sistema.autentica(adm);
	}
}