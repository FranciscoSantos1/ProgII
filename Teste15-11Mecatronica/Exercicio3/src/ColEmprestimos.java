import java.util.ArrayList;

public class ColEmprestimos {
    private ArrayList<Emprestimo> emprestimos;

    public ColEmprestimos(){
        emprestimos = new ArrayList<>();
    }

    public int getQtdEmprestimos(){
        return this.emprestimos.size();
    }

    public int getQtdEmprestimo(String tipo){
        int total = 0;

        for(Emprestimo i : emprestimos){
            if(i instanceof EmprestimoInstrumento){
                if(((EmprestimoInstrumento)i).getTipo().equals(tipo)){
                    total ++;
                }
            }
        }
        return total;
    }
}
