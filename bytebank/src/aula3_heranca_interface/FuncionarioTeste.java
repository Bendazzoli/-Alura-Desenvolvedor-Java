package aula3_heranca_interface;

public class FuncionarioTeste {
	
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 funcionario comum || 1 - Gerente || 2 - Diretor
	
	public FuncionarioTeste(String nome, String cpf, double salario, int tipo){
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.tipo = tipo;
	}
	
	public double getBonificacao(){
		if(this.tipo == 0){ // Funcionario Comum
			return this.salario * 0.10;
		}else if(this.tipo == 1){ // Funcionario Gerente
			return this.salario;
		}else{ // Funcionario Diretor
			return this.salario + 1000;
		}
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
