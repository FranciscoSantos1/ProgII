import java.util.HashSet;
import java.util.Set;

public class Disciplina {
    private String nome;
    private String descricao;
    private Set<Turma> turmas;

    public Disciplina(String nome) {
        this.nome = nome;
        turmas = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void acrescentaTurma(Turma t){
        this.turmas.add(t);
        t.setDisc(t.getDisc());
    }

}
