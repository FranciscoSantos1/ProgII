import java.util.Date;

public class EspetaculoFolclore extends Espetaculo{
    private String nome;
    private int numDancarinos;
    private int numGrupos;

    public EspetaculoFolclore(int codEspetaculo, Date dataEspetaculo, TipoEspetaculo tipo, String nome, int numDancarinos, int numGrupos) {
        super(codEspetaculo, dataEspetaculo, tipo);
        this.nome = nome;
        this.numDancarinos = numDancarinos;
        this.numGrupos = numGrupos;
    }
}
