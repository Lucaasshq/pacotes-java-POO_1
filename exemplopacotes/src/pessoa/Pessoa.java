package pessoa;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	// Construtor em Java
	public Pessoa(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
		
	
	public Pessoa() {
		
	}


	// Gets em java
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	

}
