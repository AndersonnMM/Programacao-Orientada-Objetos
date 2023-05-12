package exercicio03;

import java.util.Date;
import java.util.List;

public class Professor extends Pessoa {
    private double salario;
    private List<String> disciplinas;
    
    public Professor(String nome, String cpf, Date dataNascimento, double salario, List<String> disciplinas) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.disciplinas = disciplinas;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public List<String> getDisciplinas() {
        return disciplinas;
    }
}
