package model.entities;

public class Hospital {
	private String nome;
	private String enderešo;
	
	public Hospital() {
	}

	public Hospital(String nome, String enderešo) {
		this.nome = nome;
		this.enderešo = enderešo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	
	public String imprimirValores() {
		return nome + " " + enderešo;
	}
}
