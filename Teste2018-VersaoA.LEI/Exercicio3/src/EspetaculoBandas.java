import java.util.Date;

public class EspetaculoBandas extends Espetaculo{
    private int numBandas;
    private String descricao;

    public EspetaculoBandas(int codEspetaculo, Date dataEspetaculo, TipoEspetaculo tipo, int numBandas,String descricao){
        super(codEspetaculo,dataEspetaculo, tipo);
        this.numBandas = numBandas;
        this.descricao = descricao;
    }
}
