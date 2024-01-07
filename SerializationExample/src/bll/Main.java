package bll;

public class Main {
    public static void main(String[] args) {

        Repositorio repo = Repositorio.getRepositorio();

        try {
            repo.registarTurma(
                    new Turma("123", "História de Portugal"));
        }
        catch(TurmaException ex){
            System.out.println(ex.getMessage());
        }

        Aluno a1, a2, a3, a4;
        a1 = new Aluno(25000, "Joaquim");
        a2 = new Aluno(25002, "Maria");
        a3 = new Aluno(25003, "Joana");
        a4 = new Aluno(25004, "Joana");

        Turma t = repo.getTurmas().get("123");

        repo.registarAluno(a1);
        repo.registarAluno(a2);
        repo.registarAluno(a3);
        try {
            t.inscreverAluno(a1);
            t.inscreverAluno(a3);
            t.inscreverAluno(a1);
        }
        catch(AlunoException ex){
            System.out.println(ex.getMessage());
        }
        try {
            t.inscreverAluno(a2);
        }
        catch(AlunoException ex){
            System.out.println(ex.getMessage());
        }
        try {
            t.inscreverAluno(a4);
        }
        catch(AlunoException ex){
            System.out.println(ex.getMessage());
        }

        for(Aluno al : t.getInscritos().values()){
            System.out.println(al.getNumero() + " --> " + al.getNome());
        }

        repo.serializar("repositorio.dat");

    }
}