public class Atleta {
    private int codAtleta;
    private String nome;
    private String modalidade;

    public Atleta(){};
    public Atleta(int codAtleta){
        this.codAtleta = codAtleta;
    }

    public int getCodAtleta(){ return this.codAtleta;}

    public void setName(String nome){ this.nome = nome;}
    public String getName(){ return this.nome;}

    public void setModalidade(String modalidade){ this.modalidade = modalidade;}
    public String getModalide(){ return this.modalidade;}

    public String toString(){
        return "Atleta com codigo: " + this.codAtleta + "tem o nome " + this.nome;
    }


}
