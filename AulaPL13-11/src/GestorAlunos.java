import java.io.Serializable;
import java.util.*;

public class GestorAlunos implements Serializable {

    private static final Long serialVersionUID = 1L;
    private static GestorAlunos instance;

    private Map<String, List<Aluno>> alunos;

    private GestorAlunos(){
        alunos = new HashMap<>();

    }

    public static GestorAlunos getInstance(){
        if(instance==null){
            instance = new GestorAlunos();
        }
        return instance;
    }

    public void adicionaAluno(Aluno aluno){
        String localidade = aluno.getLocalidade();
        /*if(alunos.containsKey(localidade)){
            alunos.get(localidade).add(aluno);
        } else{
            List<Aluno> lista = new ArrayList<>();
            lista.add(aluno);
            alunos.put(localidade, lista);
        }
*/
    try{
        alunos.get(localidade).add(aluno);
    } catch (NullPointerException e){
        System.out.println(e.getMessage() + " ja estava a espera.");
        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);
        alunos.put(localidade, lista);
    }
    }


    public Iterator<Aluno> getAlunoByLocalidade(String localidade){

        return alunos.get(localidade).iterator();
    }
}
