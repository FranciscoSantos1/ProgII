import java.util.ArrayList;
import java.util.List;

public class ProvaDesportiva {
    private String idProva;
    private List<Atletas> atletas;

    public ProvaDesportiva(String idProva) {
        atletas = new ArrayList<>();
        this.idProva = idProva;
    }

    public String getIdProva(){
        return this.idProva;
    }


    public void inscreveAtleta(Atletas atleta){
        for(Atletas i : atletas){
            if(atleta.getNumAtleta() == i.getNumAtleta())
                return;
        }
        atletas.add(atleta);
    }

    public int getQtdAtletasInscritos(){
        return atletas.size();
    }

    public Atletas getAtleta(int numAtleta){
        for(Atletas i : atletas){
            if(i.getNumAtleta() == numAtleta){
                return i;
            }
        }
        return null;
    }

}
