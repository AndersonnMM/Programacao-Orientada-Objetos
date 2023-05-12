package atividade01;

import java.util.Date;

public class Aluno {
	
	private String nome;
	private String email;
	private Integer cpf;
	private Date datanascimento;
	
	//Construtor Vazio
	public Aluno() {
		super();
	}

	//Construtor com parâmetros
	public Aluno(String nome, String email, Integer cpf, Date datanascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.datanascimento = datanascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Date getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}
	
	
	public void idadeAluno(Aluno aluno, Aluno aluno2, Aluno aluno3) {
		Integer idade = 0, idade2 = 0, idade3 = 0;
		idade = new Date().getYear() - aluno.getDatanascimento().getYear();
		idade2 = new Date().getYear() - aluno2.getDatanascimento().getYear();
		idade3 = new Date().getYear() - aluno3.getDatanascimento().getYear();
		
		if (idade > idade2) {
			if (idade > idade3) {
				System.out.println("\nAluno mais velho:");
				System.out.println("Nome: "+aluno.getNome());
				System.out.println("Idade: "+idade);
			}
			else {
				System.out.println("\nAluno mais velho:");
				System.out.println("Nome: "+aluno3.getNome());
				System.out.println("Idade: "+idade3);
			}
		}
		else if (idade2 > idade3) {
			System.out.println("\nAluno mais velho:");
			System.out.println("Nome: "+aluno2.getNome());
			System.out.println("Idade: "+idade2);
		}
		else {
			System.out.println("\nAluno mais velho:");
			System.out.println("Nome: "+aluno3.getNome());
			System.out.println("Idade: "+idade3);
		}
	}
}
