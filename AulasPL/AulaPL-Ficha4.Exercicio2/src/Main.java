import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Portico portico = new Portico();

        PassagemVeiculo v1 = new PassagemVeiculo(1, new Date(), "X", "AB 01 BA");
        portico.adicionarPassagem(v1);

        PassagemVeiculo v2 = new PassagemVeiculo(2, new Date(), "YY", "BA 10 BA");
        portico.adicionarPassagem(v2);

        PassagemVeiculo v3 = new PassagemVeiculo(3, new Date(), "Y", "XZ 01 ZX");
        portico.adicionarPassagem(v3);

        PassagemVeiculo v4 = new PassagemVeiculo(4, new Date(), "K", "KA 01 AS");
        portico.adicionarPassagem(v4);

        PassagemVeiculo v5 = new PassagemVeiculo(5, new Date(), "Z", "BT 01 GA");
        portico.adicionarPassagem(v5);

        for(PassagemVeiculo p : portico.getPassagem()){
            System.out.println(p.matricula);
        }
    }
}