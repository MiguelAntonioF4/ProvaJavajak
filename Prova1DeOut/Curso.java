package Prova1DeOut;
import java.util.ArrayList;

public class Curso {
    
    int id;
    String nome;
    int cargaHoraria;
    Professor Professor;

    static ArrayList<Curso> cursos = new ArrayList<>();

    public Curso(int id, String nome, int cargaHoraria, Professor Professor ){

        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.Professor = Professor;

        cursos.add(this); // Adiciona o curso à lista
    }

    static void verificaId(int id) throws Exception { // vê se um curso com um determinado id existe na lista
        for (Curso curso : cursos) {
            if (curso.id == id) { // Vê se o ID do curso atual é igual ao ID colocado

                return;
            }
        }
        throw new Exception("Curso não encontrado");
    }

    static Curso buscaCurso(int id) { // ele faz uma busca pelo nome do curso usando a id que ele foi registrado
        for (Curso curso : cursos) {
            if (curso.id == id) {
                return curso;
            }
        }
        return null;
    }
}

