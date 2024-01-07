import java.util.Date;

public class Vinho {
    protected String nome;
    protected int nLote;
    protected double grau;
    protected Date dataEngarraf;
    protected TipoVinho tipo;

    public Vinho(){};

    public Vinho(String nome, int nLote, double grau, Date dataEngarraf, TipoVinho tipo){
        this.nome = nome;
        this.nLote = nLote;
        this.grau = grau;
        this.dataEngarraf = dataEngarraf;
        this.tipo = tipo;
    }

    public String getName(){
        return this.nome;
    }

    public void setName(String nome){
        this.nome = nome;
    }

    public int getNLote(){
        return this.nLote;
    }

    public double getGrau(){
        return this.grau;
    }

    public void setGrau(double grau){
        this.grau = grau;
    }

    public Date getDate(){
        return this.dataEngarraf;
    }

    public void setDate(Date data){
        this.dataEngarraf = data;
    }

    public TipoVinho getTipo(){
        return this.tipo;
    }

    public void setTipoVinho(TipoVinho tipo){
        this.tipo = tipo;
    }

}
