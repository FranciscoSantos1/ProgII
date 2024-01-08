import java.util.Date;

public class ContaBancaria {
    private String titular;
    private double saldo = 0.0;
    private Date dataAbertura;

    public ContaBancaria(String nomeTitular){
        this.titular = nomeTitular;
        this.dataAbertura = new Date();

    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void depositar(double montante){
        this.saldo += montante;
    }

    public void levantar(double montante){
        if(montante <= this.saldo){
            this.saldo -= montante;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public String getInformacao(){
        String info;
        info = " Titular = " + this.getTitular() + ", Saldo = "
                + this.saldo + ", Data Abertura = " + this.getDataAbertura();
        return info;
    }
}
