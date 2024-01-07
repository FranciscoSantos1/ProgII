import java.util.HashSet;
import java.util.Set;

public class Corrida {
    private String idCorrida;
    private Set<Atleta> atletas;

    public Corrida(String idCorrida){
        this.idCorrida = idCorrida;
        atletas = new HashSet<>();
    }

    public String getIdCorrida(){
        return this.idCorrida;
    }

    public void adicionaAtleta(Atleta atleta){
        for(Atleta i : atletas){
            if(i.getCodAtleta() == atleta.getCodAtleta()){
                return;
            }
        }
        atletas.add(atleta);
    }

    public Atleta getAtleta(int codAtleta){
        for(Atleta i : atletas){
            if(i.getCodAtleta() == codAtleta){
                return i;
            }
        }
        return null;
    }

    public int getQtdAtletas(){
        return atletas.size();
    }
}
