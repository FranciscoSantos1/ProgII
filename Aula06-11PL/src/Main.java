import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Aluno a1, a2;
        a1 = new Aluno(1, "Ana");
        a2 = new Aluno(2, "Bruno");

        Aluno a3 = new Aluno(1, "Ana");

        Set<Aluno> turma = new HashSet<>();

        turma.add(a1);
        turma.add(a2);
        turma.add(a3);

        for(Aluno i : turma){
            System.out.println(i);
        }

    }
}