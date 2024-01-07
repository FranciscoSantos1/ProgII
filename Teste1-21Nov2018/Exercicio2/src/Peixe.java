public class Peixe {
    private int codPeixe;
    private String nome;
    private String especie;


    public Peixe(String especie, int codPeixe){
        this.especie = especie;
        this.codPeixe = codPeixe;
        this.nome = "";
    }

    public int getCodPeixe(){
        return this.codPeixe;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getName(){
        return this.nome;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public String getEspecie(){
        return this.especie;
    }

    public String toString(){
        return "Peixe com código: " + this.codPeixe +
                " tem nome " + this.nome + " e espécie " + this.especie;
    }

}

