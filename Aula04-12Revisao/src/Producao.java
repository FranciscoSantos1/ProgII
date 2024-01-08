import java.util.*;

public class Producao {
    //2.1
    private String titulo;
    private String resumo;
    Map<String, Set<Artista>> artistas;
    private List<Evento> eventos;

    public Producao(String titulo){
        this.titulo = titulo;
        artistas = new HashMap<>();
        eventos = new ArrayList<>();
    }
    //2.2
    //a
    public void adicionaArtista(Artista artista) throws  ArtistaException {
        for(String tipo : this.artistas.keySet()){
            if(artistas.get(tipo).contains(artista)){
                throw new ArtistaException("Artista ja existe!");
            }
        }
        if(!artistas.containsKey(artista.getTipoArtista)){
            artistas.put(artista.getTipoArtista(), new HashSet());
        }
        artistas.get(artista.getTipoArtista()).add(artista);
        artista.getProducoes.add(this);
    }

    //b
    public int getQtdTotalBilhetes(){
        int total=0;
        for(Evento ev : eventos){
            total += ev.getQtdBilhetesVendidos();
        }
        return total;
    }

    //c
    public SalaDeEspetaculos getSalaEvMaisBilhetesVendidos() {
        SalaDeEspetaculos sala = null;
        int maior = 0;

        for(Evento ev : eventos){
            if(ev.getQtdBilhetesVentidos() > maior) {
                maior = ev.getQtdBilhetesVendidos;
                sala = ev.getSala;
            }
        }
        return sala;
    }

    //d
    public void removerArtistas(String tipo) {
        aristas.remove(tipo);
    }
}
