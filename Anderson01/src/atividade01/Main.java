package atividade01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Aluno aluno = new Aluno(); 	
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date nasc1 = formato.parse("05/11/1901");
		Aluno aluno1 = new Aluno("Pizza", "pizza.pizza", 456588777, nasc1);
		Date nasc2 = formato.parse("06/10/1901");
		Aluno aluno2 = new Aluno("frango", "frabgo.com", 757578575, nasc2);
		Date nasc3 = formato.parse("04/05/1901");
		Aluno aluno3 = new Aluno("Vaca", "vaca.com", 1545478677, nasc3);
		System.out.println("Aluno");
		System.out.println("Nome: "+aluno1.getNome());
		System.out.println("CPF: "+aluno1.getCpf());
		System.out.println("E-mail: "+aluno1.getEmail());
		System.out.println("Data de Nascimento: "+aluno1.getDatanascimento());
		System.out.println("Aluno");
		System.out.println("Nome: "+aluno2.getNome());
		System.out.println("CPF: "+aluno2.getCpf());
		System.out.println("E-mail: "+aluno2.getEmail());
		System.out.println("Data de Nascimento: "+aluno2.getDatanascimento());
		System.out.println("Aluno");
		System.out.println("Nome: "+aluno3.getNome());
		System.out.println("CPF: "+aluno3.getCpf());
		System.out.println("E-mail: "+aluno3.getEmail());
		System.out.println("Data de Nascimento: "+aluno3.getDatanascimento());
		
		aluno.idadeAluno(aluno1, aluno2, aluno3);

	}

}
