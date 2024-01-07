public class ContadorAluno {

    private int contador;
    private static ContadorAluno instance = null;

    private ContadorAluno(){
        this.contador = 0;
    }

    public static synchronized ContadorAluno getInstance(){
        if(instance == null){
            instance = new ContadorAluno();
        }
        return instance;
    }

    public int getNext(){
        return ++this.contador;
    }

}
