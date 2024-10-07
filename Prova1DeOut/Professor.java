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
        this.cursos = new ArrayList<>(); //  inicializa uma lista de cursos para que o prof possa ter cursos associados.
        
        professores.add(this); // Adiciona o professor à lista
    }

    static void verificaId(int id) throws Exception { // vê se um professor com um determinado id existe na lista
        for (Professor professor : professores) {
            if (professor.id == id) {
                return;
            }
        }
        throw new Exception("Professor não encontrado"); //  sinaliza que algo aconteceu e manda uma mensagem de erro
    }

    static Professor buscaProfessor(int id) { // ele faz uma busca pelo nome do professor usando a id que ele mesmo foi registrado
        for (Professor professor : professores) {
            if (professor.id == id) {
                return professor;
            }
        }
        return null;
    }
}


