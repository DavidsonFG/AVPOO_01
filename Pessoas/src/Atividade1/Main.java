package Atividade1;

public class Main {
    public static void main(String[] args) {
        // g) Criar no main um objeto do tipo Atividade1.Professor com os dados “mocados”, executar o método mostraProfessor()
        Professor professor = new Professor("Prof. Silva", "silva@example.com", "senha321", 50.0f, 20);
        System.out.println(professor.mostraProfessor());

        // h) Criar um objeto do tipo Atividade1.Aluno com os dados “mocados”, executar o método mostraAluno()
        Aluno aluno = new Aluno("Atividade1.Aluno Silva", "aluno@example.com", "senha456", 3, 101);
        System.out.println(aluno.mostraAluno());
    }
}
