import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Repositorio implements Serializable {

    private static Repositorio repo=null;

    private Map<String, Turma> turmas;

    private Set<Aluno> alunos;

    public Map<String, Turma> getTurmas(){
        return turmas;
    }

    public Set<Aluno> getAlunos(){
        return alunos;
    }


    private Repositorio(){
        this.turmas = new HashMap<>();
        this.alunos = new HashSet<>();
    }

    public static Repositorio getRepositorio(){
        if(repo == null){
            repo = new Repositorio();
        }
        try{
            System.out.println("A ler ficheiro...");
            repo = Repositorio.desserializar("repositorio.dat");
            System.out.println("Ficheiro lido com sucesso.");
        } catch( Exception e){

        }
        return repo;
    }

    public void registarTurma(Turma t) throws TurmaException {
        if(turmas.containsKey(t.getCodigo())){
            throw new TurmaException("Codigo de Turma ja existente.");
        }
        this.turmas.put(t.getCodigo(), t);
    }

    public void registarAluno(Aluno a){
        alunos.add(a);
    }

    public void serializar(String filename){
        Repositorio carteira = null;

        try{
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            repo = (Repositorio) in.readObject();
            in.close();
            fileIn.close();
        } catch(Exception e){
            System.out.println("Erro " + e.getMessage());
            return;
        }
    }

    public static Repositorio desserializar(String filename) throws ClassNotFoundException, IOException {
        if
    }


}
