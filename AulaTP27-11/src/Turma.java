import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Turma implements Serializable {
    private String codigo;

    private String nomeDisciplina;

    private Map<Integer, Aluno> inscritos;

    public Turma(String codigo, String nomeDisciplina) {
        this.codigo = codigo;
        this.nomeDisciplina = nomeDisciplina;
        inscritos = new HashMap<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void inscreverAluno(Aluno aluno) throws AlunoException{
        if(inscritos.contains(aluno)){
            throw new AlunoException("Aluno ja inscrito");
        }
        inscritos.add(aluno);
        aluno.getTurmasEmQueEstaInscrito().add(this);
    }
}
