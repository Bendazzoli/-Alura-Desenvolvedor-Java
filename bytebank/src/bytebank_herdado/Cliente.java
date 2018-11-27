package bytebank_herdado;

public class Cliente implements Autenticavel {

	private AutenticacaoUtil auticador;
	
	public Cliente() {
		this.auticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.auticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.auticador.autentica(senha);
	}
}
