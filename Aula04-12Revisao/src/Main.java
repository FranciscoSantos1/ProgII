import java.sql.SQLOutput;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Producao prod = new Producao("JamiRaquai ao vivo em Viana");

        Artista a1, a2;
        Evento e1, e2, e3;
        SalaDeEspetaculos s1, s2;

        s1 = new SalaDeEspetaculos("Pavilhao Multiusos");
        s2 = new SalaDeEspetaculos("Teatro");

        a1 = new Artista();
        a2 = new Artista();

        try{
            prod.adicionaArtista(a1);
            prod.adicionaArtista(a2);
        }catch (ArtistaException ex){
            ex.getMessage();
        }

        e1 = new Evento(); e1.setDataHora(new Date(2023, 12, 10));
        e2 = new Evento(); e2.setDataHora(new Date(2023, 12, 15));
        e3 = new Evento(); e3.setDataHora(new Date(2023, 12, 18));

        System.out.println("Qtd total de bilhetes vendidos: " + prod.getQtdTotalBilhetes());
        System.out.println("Sala com mais bilhetes vendidos: " + prod.getSalaEvMaisBilhetesVendidos().getNome());
    }
}