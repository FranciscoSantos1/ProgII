public class Main {
    public static void main(String[] args) {
    Repositorio repo = Repositorio.getRepositorio();

    try{
        repo.registarTurma(new Turma("123", "Historia de Portugal"));
    } catch(TurmaException ex){
        System.out.println(ex.getMessage());
    }

    Aluno a1, a2, a3;
    a1 = new Aluno(25000, "Joaquim");
    a2 = new Aluno(25002, "Maria");
    a3 = new Aluno(25003, "Joana");
    }




    for(Aluno al : t.getInscritos){
        System.out.println();
    }

    repo.serializar("repositorio.dat");
}