public class NavioPortaContentores extends Navio{
    private int capacidadeContentores;

    public NavioPortaContentores(String matricula, String nome, double comprimento, int capacidade){
        super(matricula, nome, comprimento);
        this.capacidadeContentores = capacidade;
    }

    public int getCapacidade() {
        return capacidadeContentores;
    }

    public void setCapacidade(int capacidade) {
        this.capacidadeContentores = capacidade;
    }
}
