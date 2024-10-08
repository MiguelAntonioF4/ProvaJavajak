package Prova1DeOut;
import java.util.ArrayList;

public class Aluno {
    
    int id;
    String nome;
    String dataNascimento;
    String cpf;
    Curso Curso;  
    int idProfessor;  

    static ArrayList<Aluno> alunos = new ArrayList<>();

    public Aluno(int id, String nome, String dataNascimento, String cpf, Curso Curso, int idProfessor) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.Curso = Curso;
        this.idProfessor = idProfessor;  

        alunos.add(this); // Adiciona o alunos à lista
    }

    static int contarAlunosPorProfessor(int idprofessor) { // O nome ja dis né? ele vai pega a quantidade de alunos cadastrados para um determinado professor
        int cont = 0;
        for (Aluno aluno : alunos) {
            if (aluno.idProfessor == idprofessor) {  // Vê se o ID do professor do aluno corresponde ao ID colocado
                cont++;
            }
        }
        return cont;
    }
}

