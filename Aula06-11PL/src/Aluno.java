public class Aluno {
    private int BI;
    private String nome;

    public Aluno(){};

    public Aluno(int BI, String nome){
        this.nome = nome;
        this.BI = ContadorAluno.getInstance().getNext();
    }

    public int getBi(){ return this.BI; }

    public String getNome(){ return this.nome; }
    public void setNome(String nome){ this.nome = nome; }

    public String toString(){
        return this.nome + this.BI;
    }

    public boolean equals(Object obj){

        if(obj instanceof Aluno){
            Aluno a = (Aluno)obj;
            if(a.getBi() == this.BI && a.getNome().equals(this.nome)){
                return true;
            }
        }
        return false;
    }

    public int hashCode(){
        return 97 * this.nome.hashCode() + 107 * this.BI;
    }

    public void test(String s, int... vars){
        for(int i : vars){
            //....

        }
    }

    public static void main(String[] args) {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

