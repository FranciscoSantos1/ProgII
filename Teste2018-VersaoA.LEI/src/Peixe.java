public class Peixe {
    private int codPeixe;
    private String nome;
    private String especie;

    // construtor omitido
    public Peixe(String especie, int codPeixe){
        this.especie = especie;
        this.codPeixe = codPeixe;
    };

    public int getCodPeixe() { return this.codPeixe; }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return this.nome; }

    public void setEspecie (String especie) {
        this.especie = especie;
    }
    public String getEspecie() { return this.especie; }

    public String getInfoPeixe() {
        return "Peixe com código: " + this.codPeixe +
                " tem nome " + this.nome + " e espécie " + this.especie;
    }

}
