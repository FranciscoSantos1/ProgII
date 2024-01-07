public abstract class Lote implements ILote{
    private int numLote;
    private String nome;

    public Lote(int numLote){
        this.numLote = numLote;
    };

    public int getNumLote() {
        return this.numLote;
    }
    public void setNumber(int numLote){
        this.numLote = numLote;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getDescrLote();
}
