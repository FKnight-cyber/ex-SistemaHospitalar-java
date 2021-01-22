package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import model.entities.Medico;
import model.entities.Paciente;
import model.entities.Pessoa;

public class SistemaHospitalar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> p1= new ArrayList<>();
		
		System.out.print("Hospital: ");
		String nomeHospital = sc.nextLine();
		System.out.print("Endere�o: ");
		String enderecoHospital = sc.nextLine();
		
		System.out.println("Informe a quantidade de pessoas a serem cadastradas");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 1;i <= n;i++) {
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Endere�o: ");
			String endere�o = sc.nextLine();
			System.out.print("Idade: ");
			Integer idade = sc.nextInt();
			System.out.print("CPF: ");
			int cpf = sc.nextInt();
			sc.nextLine();
			System.out.print("Sexo: ");
			char sexo = sc.next().charAt(0);
			
			System.out.println("paciente ou m�dico?");
			char controle = sc.next().charAt(0);
			sc.nextLine();
			if(controle == 'p') {
				System.out.print("Doen�a: ");
				String doen�a = sc.nextLine();
				System.out.print("Medica��o: ");
				String medica�ao= sc.nextLine();
				System.out.println("O paciente pode andar? (Sim/N�o)");
				char walk = sc.next().charAt(0);
				sc.nextLine();
				
				p1.add(new Paciente(nome, endere�o, idade ,cpf ,sexo , doen�a , medica�ao));
			}
			else {
				System.out.print("CRM: ");
				Integer crm = sc.nextInt();
				sc.nextLine();
				System.out.print("Especializa��o: ");
				String especializacao = sc.nextLine();
				System.out.println("Sal�rio: ");
				Double salario = sc.nextDouble();
				
				p1.add(new Medico(nome, endere�o, idade, cpf, sexo, crm, salario, especializacao));
			}
			}
		for(Pessoa p : p1) {
			System.out.println(p.imprimirValores());
		}
		sc.close();
	}
}
