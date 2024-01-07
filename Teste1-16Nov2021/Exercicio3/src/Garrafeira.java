import java.util.ArrayList;

public class Garrafeira {
    private ArrayList<Vinho> garrafeira;


    //constructors

    public Garrafeira(){
        garrafeira = new ArrayList<>();
    }

    //methods

    public int getVinhosReserva(){
        int total = 0;

        for(Vinho x : garrafeira){
            if(x instanceof VinhoReserva){
                total += ((VinhoReserva) x).getNumGarrafas();
            }
        }
        return total;
    }

    public double getTotalVinhosCorrentesTintos(){
        double total = 0.0;

        for(Vinho x : garrafeira){
            if(x instanceof VinhoCorrente){
                if((x.tipo.equals(TipoVinho.TINTO))){
                    total += ((VinhoCorrente) x).getNumLitros();
                }
            }
        }
        return total;
    }
}
