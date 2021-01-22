package model.entities;

public class Paciente extends Pessoa{
	private String doen�a;
	private String medicacao;
	
	public Paciente() {
	}

	public Paciente(String nome, String endere�o, Integer idade, Integer cpf, char sexo, String doen�a,
			String medicacao) {
		super(nome, endere�o, idade, cpf, sexo);
		this.doen�a = doen�a;
		this.medicacao = medicacao;
	}

	public String getDoen�a() {
		return doen�a;
	}

	public void setDoen�a(String doen�a) {
		this.doen�a = doen�a;
	}

	public String getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}
	
	public String dor(char c) {
		if(c=='s')
			return "O paciente est� sentindo dor";
		else
			return "O paciente est� bem";
	}
	
	public String alta(char c) {
		if(c=='s')
			return "O paciente vai receber alta";
		else
			return "O paciente ficar� internado por mais algum tempo";
	}
	
	@Override
	public String imprimirValores() {
		return nome + " " + endere�o + " " + cpf + " " + idade + " " + sexo + " " + doen�a +
				" " + medicacao;
	}
}
