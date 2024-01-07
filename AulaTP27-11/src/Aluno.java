import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Aluno implements Serializable {
    private int num;
    private String nome;
    private List<Turma> TurmasEmQueOAlunoEstaInscrito;

    public Aluno(int num, String nome) {
        this.num = num;
        this.nome = nome;
        TurmasEmQueOAlunoEstaInscrito = new LinkedList<>();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }

    public void inscreverAluno()
}
