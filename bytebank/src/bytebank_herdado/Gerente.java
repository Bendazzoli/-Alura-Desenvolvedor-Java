package bytebank_herdado;

public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil auticador;
	
	public Gerente() {
		this.auticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
	    return super.getSalario();
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
