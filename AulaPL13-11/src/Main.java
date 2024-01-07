import java.io.*;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        try{
            Aluno a1 = new Aluno(12345, "joao", "rua", "Viana");
            GestorAlunos.getInstance().adicionaAluno(a1);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        Iterator<Aluno> it = GestorAlunos.getInstance().getAlunoByLocalidade("Viana");
        while(it.hasNext()) {
            Aluno a = it.next();
            /*System.out.println(a);*/
            StringTokenizer st = new StringTokenizer(a.getNome(), " ");
            String filename = st.nextToken() + ".serial";

            /*StringBuilder sb = new StringBuilder();
            sb.append(st.asIterator().toString()); //JUNTAR TODOS OS TOKENS*/

            //ESCREVER FICHEIRO

            try {
                FileOutputStream fout = new FileOutputStream(filename);
                ObjectOutputStream objout = new ObjectOutputStream(fout);
                objout.writeObject(a);

                fout.flush();
                fout.close();
            } catch (Exception e) {
                throw new RuntimeException(e);

            }

            //LER FICHEIRO
            try{
                FileInputStream fin = new FileInputStream(filename);
                ObjectInputStream objin = new ObjectInputStream(fin);

                Aluno aluno = (Aluno) objin.readObject();
                System.out.println(aluno);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
}