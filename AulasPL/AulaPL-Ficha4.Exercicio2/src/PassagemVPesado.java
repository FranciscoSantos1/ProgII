import java.util.Date;

public class PassagemVPesado extends PassagemVeiculo{
    private int numEixos;

    public PassagemVPesado(int codPassagem, Date data, String marca, String matricula, int num_eixos){
        super(codPassagem, data, marca, matricula);
        this.numEixos = num_eixos;
    }

    public int getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(int numEixos){
        this.numEixos = numEixos;
    }

    @Override
    public String toString() { return this.matricula + " " + this.marca + " " + this.numEixos;}
}
