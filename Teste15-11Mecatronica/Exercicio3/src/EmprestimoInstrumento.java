import java.util.Date;

public class EmprestimoInstrumento extends Emprestimo{
    private String tipo;
    private String nome;

    public EmprestimoInstrumento(int codEmprestimo, Date data, String nomeMembro, String nome, String tipo){
        super(codEmprestimo, data, nomeMembro);
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getTipo(){
        return this.tipo;
    }
}
