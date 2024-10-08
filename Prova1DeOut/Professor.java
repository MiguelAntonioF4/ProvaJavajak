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
        for (Professor professor : professores) {  // passa por todos os professores cadastrados
            if (professor.id == id) { // Vê se o ID do professor atual é igual ao ID colocado

                return professor;
            }
        }
        return null;
    }

    public int calculaCargaHorariaTotal() {
        int cargaTotal = 0;// Inicia com 0
        for (Curso curso : cursos) { // corre por todos os cursos ligados ao professor
            cargaTotal += curso.cargaHoraria; // ele coloca a carga horária do curso na carga total
        }
        return cargaTotal;
    }    
}


