package Prova1DeOut;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {

        System.err.println("Sisteminha de cursos");
        Scanner scanner = new Scanner(System.in);
        int opt = 0;

        do {
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Curso");
            System.out.println("3 - Cadastrar Aluno");
            System.out.println("4 - Listar Professores");
            System.out.println("5 - Listar Cursos");
            System.out.println("6 - Listar Alunos");
            System.out.println("7 - Sair");

            try{
                opt = scanner.nextInt();
            }catch (Exception e) {
                opt = 0;
            }

            switch (opt){
                case 1:
                    try {
                        System.out.println("Cadastrar Professor");
                        System.out.println("Digite a id do professor: ");
                        int id = scanner.nextInt();
                        System.out.println("Digite o nome do professor: ");
                        String nome = scanner.next();
                        System.out.println("Digite o departamento do professor: ");
                        String departamento = scanner.next();

                        new Professor (id, nome, departamento );
                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar o professor");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Cadastrar curso");
                        System.out.println("Digite a id do curso: ");
                        int id = scanner.nextInt();
                        System.out.println("Digite o nome do curso: ");
                        String nome = scanner.next();
                        System.out.println("Digite a carga horaria do curso ");
                        int cargaHoraria = scanner.nextInt();
                        System.out.println("Digite o id do professor do curso");
                        int idProfessor = scanner.nextInt();
                        Professor.verificaId(idProfessor); 
                        Professor professor = Professor.buscaProfessor(idProfessor);
                        Curso novoCurso = new Curso(id, nome, cargaHoraria, professor);
                        professor.cursos.add(novoCurso); // Adiciona o curso à lista do professor
                        
                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar o curso. " + e.getMessage());
                    }
                    break;
                    case 3:
                    try {
                        System.out.println("Cadastrar Aluno");
                        System.out.println("Digite a id do Aluno: ");
                        int id = scanner.nextInt();
                        System.out.println("Digite o nome do Aluno: ");
                        String nome = scanner.next();
                        System.out.println("Digite a data de nascimento do Aluno: ");
                        String dataNascimento = scanner.next();
                        System.out.println("Digite o cpf do Aluno: ");
                        String cpf = scanner.next();
                        System.out.println("Digite a id do curso: ");
                        int idCurso = scanner.nextInt();
                        Curso.verificaId(idCurso); 
                        Curso curso = Curso.buscaCurso(idCurso); 
                        int idProfessor = curso.Professor.id;

                        new Aluno(id, nome, dataNascimento, cpf, curso, idProfessor); 
                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar o aluno: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Listar Professores");
                    for (Professor professor : Professor.professores) {
                        System.out.println("id: " + professor.id + "\nnome: " + professor.nome + "\ndepartamento: " + professor.departamento + "\nquantidade de alunos: " + Aluno.contarAlunosPorProfessor(professor.id));
                        System.out.print("cursos que o professor está envolvido: ");
                        for (Curso curso : professor.cursos) {
                        System.out.print(curso.nome + " "); // Mostrando o nome de cada curso
                    }
                    System.out.println(); // Para quebrar linha
                    }
                    break;
                case 5:
                    System.out.println("Listar Cursos");
                    for (Curso curso : Curso.cursos){
                        System.out.println ("id:" + curso.id + "\nnome:" + curso.nome + "\ncarga horária:" + curso.cargaHoraria + "\nprofessor responsavel:" + curso.Professor.nome);
                    }
                    break;
                case 6:
                    System.out.println("Listar Alunos");
                    for (Aluno aluno : Aluno.alunos){
                        System.out.println ("id: " + aluno.id + "\nnome: " + aluno.nome + "\ndata data de nascimento: " + aluno.dataNascimento + "\nCPF do aluno: " + aluno.cpf +"\nnome do curso: " + aluno.Curso.nome);
                    } 
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }   

        }while (opt != 7);

        scanner.close();
    }
}
