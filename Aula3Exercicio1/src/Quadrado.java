public class Quadrado extends Retangulo {
    String legenda = "Sem legenda";
    public Quadrado(double lado, String color){
        width = height = lado;
        this.color = color;
    }

    public Quadrado(double lado, String cor, String legenda){
        width = height = lado;
        this.color = cor;
        this.legenda = legenda;
    }

    public double getLado(){
        return this.width;
    }

    public void setLado(double lado){
        this.width = this.height = lado;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }
}
