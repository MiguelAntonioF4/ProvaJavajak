package Prova1DeOut;
import java.util.ArrayList;

public class Professor {

    int id;
    String nome;
    String departamento;

    static ArrayList<Professor> professores = new ArrayList<>();

    public Professor(int id, String nome,String departamento) {

        this.id = id;
        this.nome = nome;
        this.departamento = departamento;

        professores.add(this);
    }

}