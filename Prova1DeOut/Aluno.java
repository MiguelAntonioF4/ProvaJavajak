package Prova1DeOut;
import java.util.ArrayList;

public class Aluno {
    
    int id;
    String nome;
    String dataNascimento;
    String cpf;
    Curso Curso;
    
    static ArrayList<Aluno> alunos = new ArrayList<>();

    public Aluno(int id, String nome, String dataNascimento, String cpf, Curso Curso){
        
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.Curso = Curso;

        alunos.add(this);
    }
}
