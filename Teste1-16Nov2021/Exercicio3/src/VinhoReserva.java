import java.util.Date;

public class VinhoReserva extends Vinho{
    private int numGarrafas;
    private int numPrimeiraGarrafa;
    private String notasProva;

    public VinhoReserva(){};

    public VinhoReserva(String nome, int nLote, double grau, Date dataEngarraf, TipoVinho tipo, int numGarrafas, int numPrimeiraGarrafa, String notasProva) {
        super(nome, nLote, grau, dataEngarraf, tipo);
        this.numGarrafas = numGarrafas;
        this.numPrimeiraGarrafa = numPrimeiraGarrafa;
        this.notasProva = notasProva;
    }

    public int getNumGarrafas(){
        return this.numGarrafas;
    }



}
