package bll;

import java.io.Serializable;
import java.util.*;
public class Turma implements Serializable {
    private String Codigo;
    private String nomeDisciplina;
    private Map<Integer, Aluno> inscritos;

    public Turma(String codigo, String nomeDisciplina) {
        Codigo = codigo;
        this.nomeDisciplina = nomeDisciplina;
        inscritos = new HashMap<>();
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String cod) {
        this.Codigo = cod;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Map<Integer, Aluno> getInscritos() {
        return inscritos;
    }


    public void inscreverAluno(Aluno aluno) throws AlunoException {

        if(inscritos.containsKey(aluno.getNumero()))
            throw new AlunoException("Aluno já está inscrito na turma!");

        inscritos.put(aluno.getNumero(), aluno);
        aluno.getTurmasEmQueEstaInscrito().add(this);
    }

}
