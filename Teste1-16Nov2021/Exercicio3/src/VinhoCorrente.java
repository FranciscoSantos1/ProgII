import java.util.Date;

public class VinhoCorrente extends Vinho{
 private double numLitros;
 private String desc;

 public VinhoCorrente(){};

 public VinhoCorrente(String nome, int nLote, double grau, Date dataEngarraf, TipoVinho tipo, double numLitros, String desc){
     super(nome, nLote, grau, dataEngarraf, tipo);
     this.numLitros = numLitros;
     this.desc = desc;
 }

    public double getNumLitros() {
        return numLitros;
    }

    public void setNumLitros(double numLitros) {
        this.numLitros = numLitros;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
