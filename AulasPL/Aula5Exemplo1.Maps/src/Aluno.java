import javax.print.attribute.HashPrintServiceAttributeSet;
import java.util.HashSet;
import java.util.Set;

public class Aluno {
    private int numero;
    private String nome;
    private Set<Turma> turmas;

    public Aluno(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        turmas = new HashSet<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
}
