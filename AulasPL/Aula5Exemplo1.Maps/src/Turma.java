import java.util.*;

public class Turma {
    private String ref;
    private int capacidade;
    private Disciplina disc;
    private Set<Aluno> inscritos;


    public Turma(Disciplina disc) {
        this.disc = disc;
        inscritos = new HashSet<>();
        disc.getTurmas().add(this);
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public void setDisc(Disciplina disc){
        this.disc = disc;
    }

    public Disciplina getDisc() {
        return disc;
    }

    public Set<Aluno> getInscritos() {
        return inscritos;
    }

    public boolean inscrever(Aluno al){
        if(inscritos.size() == capacidade){
            return false;
        }
        else{
            inscritos.add(al);
            al.getTurmas().add(this);
            return true;
        }
    }
}
