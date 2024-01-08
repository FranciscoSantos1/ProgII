import java.util.ArrayList;
import java.util.List;

public class Lista {
    private String nome;
    private List<Item> itens;

    public Lista(String nome){
        this.nome = nome;
    }
    public Lista(String nome, List<Item> itens) {
        this.nome = nome;
        itens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }


    public void printItens(){
        for(Item i : this.itens){
            System.out.print(i.getDescricao());
        }
    }
}
