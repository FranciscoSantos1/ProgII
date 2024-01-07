package bll;

import java.io.*;
import java.util.*;

public class Repositorio implements Serializable {
    private Map<String, Turma> turmas;
    private Set<Aluno> alunos;

    public Map<String, Turma> getTurmas() {
        return turmas;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    private static Repositorio repo=null;

    private Repositorio(){
        this.turmas = new HashMap<>();
        this.alunos = new HashSet<>();
    }

    public static Repositorio getRepositorio(){
//        if(repo == null)
//            repo = new Repositorio();

        if(repo == null) {
            repo = new Repositorio();

            try {
                System.out.println("A ler ficheiro...");
                repo = Repositorio.desserializar("repositorio.dat");
                System.out.println("Ficheiro lido com sucesso!");
            } catch (Exception e) {

            }
        }
        return repo;
    }

    public void registarTurma(Turma t) throws TurmaException {
        if (turmas.containsKey(t.getCodigo()))
            throw new TurmaException("Codigo de Turma já existe!");

        this.turmas.put(t.getCodigo(), t);
    }

    public void registarAluno(Aluno a) {
        this.alunos.add(a);
    }

    public void serializar(String filename) {
        // Serializar um objeto para ficheiro
        try{
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in " + filename);
        }catch(IOException ex){
            System.out.println("Erro: " + ex.getMessage());
        }
    }

    public static Repositorio desserializar(String filename)
                            throws ClassNotFoundException, IOException {
        Repositorio carteira = null;
        //try{
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            repo = (Repositorio) in.readObject();
            in.close();
            fileIn.close();
        //}
        /*
        catch(Exception ex){
            System.out.println("Erro: " + ex.getMessage());
            return null;
        }

        catch(ClassNotFoundException ex){
            System.out.println("Repositorio class not found. " + " "
                    + ex.getMessage());
            return null;
        }
        */
        return repo;
    }

}
