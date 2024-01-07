public class Atletas {
    private int numAtleta;
    private String nome;

    public Atletas(String nome, int numAtleta){
        this.nome = nome;
        this.numAtleta = numAtleta;
    }

    public int getNumAtleta(){
        return this.numAtleta;
    }

    public String getNome(){
        return this.nome;
    }

    public String getInfoAtleta(){
        return "Atleta com numero " + this.numAtleta + "tem o nome " + this.nome;
    }
}
