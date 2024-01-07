import java.util.Date;

public class Campeonato {
    protected int codCampeonato;
    protected Date dataIniCamp;
    protected TipoJogo tipo;
    protected String vencedor;

    public Campeonato(){};

    public Campeonato(int codCampeonato, Date dataIniCamp, TipoJogo tipo){
        this.codCampeonato = codCampeonato;
        this.dataIniCamp = dataIniCamp;
        this.tipo = tipo;
        this.vencedor = null;
    }

    public int getCodCampeonato(){ return this.codCampeonato;}

    public Date getDataIniCamp(){ return this.dataIniCamp;}
    public void setDataIniCamp(Date data){ this.dataIniCamp = data;}

    public TipoJogo getTipoJogo(){ return this.tipo;}
    public void setTipoJogo(TipoJogo tipo){ this.tipo = tipo;}

    public String getVencedor(){ return this.vencedor;}
    public void setVencedor(String vencedor){ this.vencedor = vencedor;}


}
