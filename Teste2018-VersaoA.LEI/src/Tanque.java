import java.util.*;

public class Tanque {
    private String idTanque;
    private List<Peixe> peixes;

    public Tanque (String idTanque) {
        peixes = new ArrayList<>();
        this.idTanque = idTanque;
    }

    public String getIdTanque () { return this.idTanque; }

    public void adicionaPeixe(Peixe peixe) {
        for(Peixe i : peixes){
            if(i.getCodPeixe() == peixe.getCodPeixe()){
                System.out.println("O peixe ja foi adicionado.");
                return;
            }
        }

        peixes.add(peixe);
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