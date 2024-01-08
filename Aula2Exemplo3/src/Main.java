import java.util.ArrayList;
import java.util.List.*;

public class Main {
    public static void main(String[] args) {
       Lista toDoList = new Lista("Coisas a fazer");

       toDoList.getItens().add(new Item("Arrumar o quarto"));
       toDoList.getItens().add(new Item("Estudar para Prog. II"));

       toDoList.printItens();
    }
}