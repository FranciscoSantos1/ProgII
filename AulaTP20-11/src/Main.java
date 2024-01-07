import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
    ILote  lote;
    ArrayList listaDeLotes<Lote>  = new ArrayList<>();

    lote = new LoteMaterial(123);

    Iterator<Lote> it = listaDeLotes.iterator();

    while(it.hasNext()){
        Lote x = it.next();

        if(x.getNumLote() == 111){
            it.remove();
        }

        System.out.println(x.getNumLote());
    }
    }
}