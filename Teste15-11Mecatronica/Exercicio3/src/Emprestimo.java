import java.util.Date;

public class Emprestimo {
    protected int codEmprestimo;
    protected Date data;
    protected String nomeMembro;

    public Emprestimo(){};
    public Emprestimo(int codEmprestimo, Date data, String nomeMembro){
        this.codEmprestimo = codEmprestimo;
        this.data = data;
        this.nomeMembro = nomeMembro;
    }

    public int getCodEmprestimo(){ return this.codEmprestimo;}

    public Date getData(){ return this.data;}
    public void setData(Date data){ this.data = data; }

    public String getNomeMembro(){ return this.nomeMembro; }
    public void setNomeMembro(String nomeMembro){ this.nomeMembro = nomeMembro;}



}
