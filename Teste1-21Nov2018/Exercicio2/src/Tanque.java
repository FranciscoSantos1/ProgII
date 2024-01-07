import java.util.ArrayList;
import java.util.List;

public class Tanque {
    private String idTanque;
    private List<Peixe> peixes;

    public Tanque(String idTanque){
        this.idTanque = idTanque;
        peixes = new ArrayList<>();
    }

    public String getIdTanque(){
        return this.idTanque;
    }

    public void adicionaPeixe(Peixe peixe){
        for(Peixe i : peixes){
            if(i.getCodPeixe() == peixe.getCodPeixe()){
                return;
            }
        }
        peixes.add(peixe);
    }

    public int getQtdPeixes(){
        return peixes.size();
    }

    public Peixe getPeixes(int codPeixe){
        for(Peixe i : peixes){
            if(i.getCodPeixe() == codPeixe){
                return i;
            }
        }
        return null;
    }
}
