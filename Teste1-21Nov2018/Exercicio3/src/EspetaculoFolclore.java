import java.util.Date;

public class EspetaculoFolclore extends Espetaculo{
    private String nome;
    private int numGrupos;
    private int numDancarinos;

    public EspetaculoFolclore(int codEspetaculo, Date dataEspetaculo, TipoEspetaculo tipo, String nome, int numGrupos, int numDancarinos) {
        super(codEspetaculo, dataEspetaculo, tipo);
        this.nome = nome;
        this.numGrupos = numGrupos;
        this.numDancarinos = numDancarinos;
    }

}
