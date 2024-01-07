import java.util.*;

public class CampeonatoElimin extends Campeonato {
    private int numJogadores;

    public CampeonatoElimin(int codCampeonato, Date date, TipoJogo tipoJogo, int numJogadores){
        super(codCampeonato, date, tipoJogo);
        this.numJogadores = numJogadores;
    }

    public int getNumJogadores(){
        return this.numJogadores;
    }

    public void setNumJogadores(int numJogadores){
        this.numJogadores = numJogadores;
    }

}
