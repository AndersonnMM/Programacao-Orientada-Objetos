package exercicio03;

import java.util.Date;

public class Aluno extends Pessoa {
    private String matricula;
    
    public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    @Override
    public double tirarCopias(int numCopias) {
        return numCopias * 0.05;
    }
}
