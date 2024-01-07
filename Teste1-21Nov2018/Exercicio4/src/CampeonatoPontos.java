import java.util.Date;

public class CampeonatoPontos extends Campeonato{
    private int numJogadores;
    private int numGrupos;
    private int numJogadoresPorGrupo;

    public CampeonatoPontos(int codCampeonato, Date dataIniCamp, TipoJogo tipo, int numJogadores, int numGrupos, int numJogadoresPorGrupo) {
        super(codCampeonato, dataIniCamp, tipo);
        this.numJogadores = numJogadores;
        this.numGrupos = numGrupos;
        this.numJogadoresPorGrupo = numJogadoresPorGrupo;
    }

}
