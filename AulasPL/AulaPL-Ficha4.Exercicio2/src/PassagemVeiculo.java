import java.util.Date;

public class PassagemVeiculo {
    protected int codPassagem;
    protected Date data;
    protected String marca;
    protected String matricula;

    public PassagemVeiculo(){
        this(0, null, null, null);
    }

    public PassagemVeiculo(int codPassagem, Date data, String marca, String matricula){
        this.codPassagem = codPassagem;
        this.data = data;
        this.marca = marca;
        this.matricula = matricula;
    }

    public int getCodPassagem() {
        return codPassagem;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() { return this.matricula + " " + this.marca;}
}
