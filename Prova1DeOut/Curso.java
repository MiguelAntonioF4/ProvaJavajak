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

        cursos.add(this);
    }

}

