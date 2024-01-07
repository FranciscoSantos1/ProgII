import java.util.Date;

public class Espetaculo {
    protected int codEspetaculo;
    protected Date dataEspetaculo;
    protected TipoEspetaculo tipo;

    public Espetaculo(){};

    public Espetaculo(int codEspetaculo, Date dataEspetaculo, TipoEspetaculo tipo){
        this.codEspetaculo = codEspetaculo;
        this.dataEspetaculo = dataEspetaculo;
        this.tipo = tipo;
    }

    public int getCodEspetaculo(){
        return this.codEspetaculo;
    }

    public Date getDataEspetaculo(){
        return this.dataEspetaculo;
    }
    public void setDataEspetaculo(Date dataEspetaculo){
        this.dataEspetaculo = dataEspetaculo;
    }

    public TipoEspetaculo getTipo(){
        return this.tipo;
    }
    public void setTipo(TipoEspetaculo tipo){
        this.tipo = tipo;
    }


}
