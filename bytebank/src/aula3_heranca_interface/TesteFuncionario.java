package aula3_heranca_interface;

public class TesteFuncionario {

	public static void main(String[] args) {
		FuncionarioTeste nico = new FuncionarioTeste("Nico", "123.456.789-00", 3000, 0);
		System.out.println("Nome: " + nico.getNome());
		System.out.println("Bonificado em: " + nico.getBonificacao());
		
		FuncionarioTeste gerente = new FuncionarioTeste("Carlos", "111.111.111-11", 5000, 1);
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Bonificado em: " + gerente.getBonificacao());
		
		FuncionarioTeste diretor = new FuncionarioTeste("Zezinho", "222.222.222-22", 9000, 2);
		System.out.println("Nome: " + diretor.getNome());
		System.out.println("Bonificado em: " + diretor.getBonificacao());
	}
}