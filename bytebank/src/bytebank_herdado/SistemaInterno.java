package bytebank_herdado;

public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel funcAut){
		boolean autenticou = funcAut.autentica(senha);
		
		if(autenticou){
			System.out.println("Login efetuado com sucesso.");
		}else{
			System.out.println("Senha inválida.");
		}
	}
}
