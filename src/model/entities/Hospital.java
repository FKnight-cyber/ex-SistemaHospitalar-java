package model.entities;

public class Hospital {
	private String nome;
	private String endereço;
	
	public Hospital() {
	}

	public Hospital(String nome, String endereço) {
		this.nome = nome;
		this.endereço = endereço;
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
	
	public String imprimirValores() {
		return nome + " " + endereço;
	}
}
