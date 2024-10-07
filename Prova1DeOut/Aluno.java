package Prova1DeOut;
import java.util.ArrayList;

public class Aluno {
    
    int id;
    String nome;
    String dataNascimento;
    String cpf;
    Curso Curso;  // Corrigi a capitalização de 'Curso' para 'curso'
    int idProfessor;  // Adicione essa linha

    static ArrayList<Aluno> alunos = new ArrayList<>();

    public Aluno(int id, String nome, String dataNascimento, String cpf, Curso Curso, int idProfessor) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.Curso = Curso;
        this.idProfessor = idProfessor;  // Armazena o id do professor

        alunos.add(this);
    }

    static int contarAlunosPorProfessor(int idprofessor) {
        int cont = 0;
        for (Aluno aluno : alunos) {
            if (aluno.idProfessor == idprofessor) {  // Use o campo correto aqui
                cont++;
            }
        }
        return cont;
    }
}

