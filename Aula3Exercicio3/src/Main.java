public class Main {
    public static void main(String[] args) {
    ContaBancaria cb;

    cb = new ContaBancaria("Joaquim");
    cb.setSaldo(1000.45);

    cb.depositar(150);
    cb.levantar(1000);

    System.out.println(cb.getInformacao());
    }
}