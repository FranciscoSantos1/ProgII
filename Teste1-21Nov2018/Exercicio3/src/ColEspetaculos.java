import java.util.ArrayList;

public class ColEspetaculos {
    private ArrayList<Espetaculo> espetaculos;

    public ColEspetaculos(){
        espetaculos = new ArrayList<>();
    }

    public int getQtdEspetaculosBandasMusica(){
        int total = 0;

        for(Espetaculo i : espetaculos){
            if(i instanceof EspetaculoBandas){
                total ++;
            }
        }

        return total;
    }

    public int getTotalEspetaculosSala(){
        int total = 0;
        for(Espetaculo i : espetaculos){
            if(i.getTipo().equals(TipoEspetaculo.EM_SALA)){
                total ++;
            }
        }

        return total;
    }
}
