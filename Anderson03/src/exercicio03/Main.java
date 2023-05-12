package exercicio03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Pessoa pessoa = new Pessoa("João", "123.456.789-00", formato.parse("15/04/1986"));
        System.out.println("Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Valor para 1000 cópias: R$" + pessoa.tirarCopias(1000));
        System.out.println();
        
        Aluno aluno = new Aluno("Maria", "987.654.321-00", formato.parse("25/05/1926"), "123456");
        System.out.println("Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Valor para 1000 cópias: R$" + aluno.tirarCopias(1000));
        System.out.println();
        
        List<String> disciplinas = new ArrayList<>();
        disciplinas.add("Matemática");
        disciplinas.add("Física");
        Professor professor = new Professor("Ana", "111.222.333-44", formato.parse("08/04/2006"), 5000.0, disciplinas);
        System.out.println("Professor:");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("CPF: " + professor.getCpf());
        System.out.println("Data de Nascimento: " + professor.getDataNascimento());
        System.out.println("Salário: R$" + professor.getSalario());
        System.out.println("Disciplinas: " + professor.getDisciplinas());
        System.out.println("Valor para 1000 cópias: R$" + professor.tirarCopias(1000));
        System.out.println();
        
        Funcionario funcionario = new Funcionario("Pedro", "555.666.777-88", formato.parse("27/10/1930"), 3000.0, formato.parse("25/12/1996"), "Analista");
        System.out.println("Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
        System.out.println("Salário: R$" + funcionario.getSalario());
        System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Valor para 1000 cópias: R$" + funcionario.tirarCopias(1000));
        System.out.println();
    }

}
