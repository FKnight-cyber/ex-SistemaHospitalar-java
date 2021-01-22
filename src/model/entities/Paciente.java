package model.entities;

public class Paciente extends Pessoa{
	private String doença;
	private String medicacao;
	
	public Paciente() {
	}

	public Paciente(String nome, String endereço, Integer idade, Integer cpf, char sexo, String doença,
			String medicacao) {
		super(nome, endereço, idade, cpf, sexo);
		this.doença = doença;
		this.medicacao = medicacao;
	}

	public String getDoença() {
		return doença;
	}

	public void setDoença(String doença) {
		this.doença = doença;
	}

	public String getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}
	
	public String dor(char c) {
		if(c=='s')
			return "O paciente está sentindo dor";
		else
			return "O paciente está bem";
	}
	
	public String alta(char c) {
		if(c=='s')
			return "O paciente vai receber alta";
		else
			return "O paciente ficará internado por mais algum tempo";
	}
	
	@Override
	public String imprimirValores() {
		return nome + " " + endereço + " " + cpf + " " + idade + " " + sexo + " " + doença +
				" " + medicacao;
	}
}
