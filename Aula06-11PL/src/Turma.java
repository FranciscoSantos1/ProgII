import java.util.*;

public class Turma<T> {
    private Map<Integer, T> alunos;

    public Turma(){
        alunos = new HashMap<>();
    }

    public void adicionaAluno(T aluno){

        alunos.put(T. aluno);
    }

    public int contaAlunos(){
        return alunos.size();
    }

    public T getAlunoByBI(int BI){
        return alunos.get(BI);
    }

    public Iterator<T> getIterator(){
        return this.alunos.values().iterator();
    }
}
