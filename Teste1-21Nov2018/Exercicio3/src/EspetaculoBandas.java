import java.util.Date;

public class EspetaculoBandas extends Espetaculo{
    private int numBandas;
    private String descricao;

    public EspetaculoBandas(){};

    public EspetaculoBandas(int codEspetaculo, Date dataEspatuclo, TipoEspetaculo tipo, int numBandas, String descricao){
        super(codEspetaculo, dataEspatuclo, tipo);
        this.numBandas = numBandas;
        this.descricao = descricao;
    }


}
