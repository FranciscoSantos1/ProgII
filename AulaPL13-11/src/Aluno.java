import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {

    @Serial
    private static final Long serialVersionUID = 1L;

    private int NIF;
    private String nome;
    private String morada;
    private String localidade;


    public Aluno(int NIF, String nome, String morada, String localidade) throws Exception {
        if(localidade == null){
            throw new AlunoException("Localidade é campo obrigatorio!");
        }

        this.NIF = NIF;
        this.nome = nome;
        this.morada = morada;
        this.localidade = localidade;
    }

    public int getNIF() {
        return NIF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "NIF=" + NIF +
                ", nome='" + nome + '\'' +
                ", morada='" + morada + '\'' +
                ", localidade='" + localidade + '\'' +
                '}';
    }
}
