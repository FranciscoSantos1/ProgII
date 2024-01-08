public class Artista {
    private String nome;
    private String tipoArtista;

    public Artista(String nome, String tipoArtista) {
        this.nome = nome;
        this.tipoArtista = tipoArtista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoArtista() {
        return tipoArtista;
    }

    public void setTipoArtista(String tipoArtista) {
        this.tipoArtista = tipoArtista;
    }
}
