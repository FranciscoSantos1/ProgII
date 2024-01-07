public class Main {
    public static void main(String[] args) {

        Aluno a1, a2, a3;
        a1 = new Aluno(12345, "Maria");
        a2 = new Aluno(23456, "Jose");
        a3 = new Aluno(34567, "Anibal");

        Disciplina d1 = new Disciplina("Programacao 2");

        Turma t1, t2;

        t1 = new Turma(d1);
        t1.setCapacidade(2);

        System.out.println(t1.inscrever(a1));
        System.out.println(t1.inscrever(a2));

        for(Aluno a : t1.getInscritos()){
            System.out.println(a.getNumero() + " - " + a.getNome());
        }

        t2 = new Turma(d1);
        t1.setRef("T1");
        t2.setRef("T2");

        t2.setCapacidade(3);
        System.out.println(t2.inscrever(a3));

    for(Turma t: d1.getTurmas()){
        System.out.println(t.getRef());
        for(Aluno a : t.getInscritos()){
            System.out.println(" " + a.getNumero() + " - " + a.getNome());
        }
    }
    }
}