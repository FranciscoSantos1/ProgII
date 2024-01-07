import java.util.ArrayList;

public class ColCampeonatos {
    private ArrayList<Campeonato> campeonatos;

    public ColCampeonatos(){
        campeonatos = new ArrayList<>();
    }

    public int getTotalCampeonatosXadrez(){
        int total = 0;

        for(Campeonato i : campeonatos){
            if(i.getTipoJogo().equals(TipoJogo.XADREZ)){
                total ++;
            }
        }
        return total;
    }

    public int getTotalJogadoresElimin(){
        int total = 0;
        for(Campeonato i : campeonatos){
            if(i instanceof CampeonatoElimin){
                total += ((CampeonatoElimin)i).getNumJogadores();
            }
        }

        return total;
    }

}
