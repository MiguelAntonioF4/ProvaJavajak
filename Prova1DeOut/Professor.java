package Prova1DeOut;
import java.util.ArrayList;

public class Professor {

    int id;
    String nome;
    String departamento;
    ArrayList<Curso> cursos;
    static ArrayList<Professor> professores = new ArrayList<>();

    public Professor(int id, String nome,String departamento) {

        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
        this.cursos = new ArrayList<>(); // Lista de cursos
        
        professores.add(this); // Adiciona o professor à lista
    }

    static void verificaId(int id) throws Exception {
        for (Professor professor : professores) {
            if (professor.id == id) {
                return;
            }
        }
        throw new Exception("Professor não encontrado");
    }

    static Professor buscaProfessor(int id) {
        for (Professor professor : professores) {
            if (professor.id == id) {
                return professor;
            }
        }
        return null;
    }
}


