import java.util.Date;

public class EmprestimoPauta extends Emprestimo{
    private String autor;
    private String titulo;

    public EmprestimoPauta(int codEmprestimo, Date data, String nomeMembro, String titulo, String autor){
        super(codEmprestimo, data, nomeMembro);
        this.autor = autor;
        this.titulo = titulo;
    }


}
