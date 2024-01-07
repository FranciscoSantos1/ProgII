import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class Portico{
    private ArrayList<PassagemVeiculo> passagens;

    public Portico(){
        passagens = new ArrayList<>();
    }


    /*
            DESACONSELHADO!!!!!!
    */
    public ArrayList<PassagemVeiculo> getPassagem(){
        return passagens;
    }

    /*
           Devolve um iterador para a lista de passagens
            sem ter necessidade de passar a lista.
            Preferivel ao metodo anterior
    */

    public Iterator<PassagemVeiculo> getIterator(){
        return passagens.iterator();
    }

    private boolean existeCodigo(int codigo){

        // Usando um iterador
        Iterator<PassagemVeiculo> it = getIterator();
        while(it.hasNext()){
            PassagemVeiculo p = it.next();
            if(p.getCodPassagem() == codigo){
                return true;
            }
        }

        /*for(PassagemVeiculo v : passagens){
            if(v.codPassagem == codigo){
                return true;
            }
        }*/
        return false;
    }

    public void adicionarPassagem(PassagemVeiculo pv) /*throws Exception*/{
        if(existeCodigo(pv.codPassagem)){
            /*throw new Exception("Codigo ja existente");*/
            System.out.println("Codigo duplicado...");
        } else{
            passagens.add(pv);
        }
    }

    public int getNumPassagens(Date data){
        int totalPassagens = 0;

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(data);

        for(PassagemVeiculo pv : passagens){

            GregorianCalendar c = new GregorianCalendar();
            c.setTime(pv.getData());

            if(     calendar.get(GregorianCalendar.YEAR) == c.get(GregorianCalendar.YEAR) &&
                    calendar.get(GregorianCalendar.MONTH) == c.get(GregorianCalendar.MONTH) &&
                    calendar.get(GregorianCalendar.DAY_OF_MONTH) == c.get(GregorianCalendar.DAY_OF_MONTH)
            ) {
               totalPassagens ++;
            }
        }
        return totalPassagens;
    }

    public int getNumPassagensVeiculosPesadosData(Date data){
        int totalPassagens = 0;

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(data);

        for(PassagemVeiculo pv : passagens){

            GregorianCalendar c = new GregorianCalendar();
            c.setTime(pv.getData());

            if(     pv instanceof PassagemVPesado &&
                    calendar.get(GregorianCalendar.YEAR) == c.get(GregorianCalendar.YEAR) &&
                    calendar.get(GregorianCalendar.MONTH) == c.get(GregorianCalendar.MONTH) &&
                    calendar.get(GregorianCalendar.DAY_OF_MONTH) == c.get(GregorianCalendar.DAY_OF_MONTH)
            ) {
                totalPassagens ++;
            }
        }
        return totalPassagens;
    }

    public int getNumPassagensVeiculosPesadosMarca(String marca){
        int totalPassagens = 0;

        for(PassagemVeiculo pv : passagens){
            if(     pv instanceof PassagemVPesado &&
                    pv.getMarca() == marca
            ) {
                totalPassagens ++;
            }
        }
        return totalPassagens;
    }

}
