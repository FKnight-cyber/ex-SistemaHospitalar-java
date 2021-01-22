package model.entities;

public class Pessoa {
	protected String nome;
	protected String endereço;
	protected Integer idade;
	protected Integer cpf;
	protected char sexo;
	
	public Pessoa() {
	}

	public Pessoa(String nome, String endereço, Integer idade, Integer cpf, char sexo) {
		this.nome = nome;
		this.endereço = endereço;
		this.idade = idade;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String canWalk(char c) {
		if(c=='s') 
			return "Can walk!";
		else
			return "Can't walk!";
	}
	
	public String imprimirValores() {
		return nome + " " + endereço + " " + cpf + " " + idade + " " + sexo;
	}
}
