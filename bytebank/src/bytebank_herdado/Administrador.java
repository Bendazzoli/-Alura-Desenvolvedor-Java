package bytebank_herdado;

public class Administrador extends Funcionario implements Autenticavel{

	private AutenticacaoUtil auticador;
	
	public Administrador() {
		this.auticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.auticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autentica(senha);
	}
}
