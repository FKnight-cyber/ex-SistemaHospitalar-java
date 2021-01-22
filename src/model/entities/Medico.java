package model.entities;

public class Medico extends Pessoa{
	private Integer crm;
	private Double salario;
	private String especializacao;
	
	public Medico() {
	}

	public Medico(String nome, String endereço, Integer idade, Integer cpf, char sexo, Integer crm, Double salario,
			String especializacao) {
		super(nome, endereço, idade, cpf, sexo);
		this.crm = crm;
		this.salario = salario;
		this.especializacao = especializacao;
	}

	public Integer getCrm() {
		return crm;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	public String plantao(char c) {
		if(c=='s')
			return "O médico estará de plantão";
		else
			return "O médico não fará plantão";
	}
	
	@Override
	public String imprimirValores() {
		return nome + " " + endereço + " " + cpf + " " + idade + " " + sexo + " " + crm + " " +
				salario + " " + especializacao;
	}
}
