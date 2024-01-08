import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalaDeEspetaculos implements ILugar{
    private String nome;
    private int lotacao;
    private List<Evento> eventos;
    private Set<ILugar> lugares;

    public SalaDeEspetaculos(String nome) {
        this.nome = nome;
        eventos = new ArrayList<>();
        lugares = new HashSet<>();
    }

    public void reservarLugar(ILugar lugar) throws ReservaLugarException{
        if(ILugar l : lugares){
            if(lug.getFila() == lugar.getFila() && lugar.getNumLugar() == lugar.getNumLugar() && !lug.getOcupado()){
                lugares.remove(lug);
                lugares.add(lugar);
            }
        }
        else throw new Exception("Lugar ja esta ocupado");
    }
}
