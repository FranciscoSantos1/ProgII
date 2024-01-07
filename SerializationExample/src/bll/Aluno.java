package bll;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Aluno implements Serializable {
    private String nome;
    private int numero;
    private List<Turma> turmasEmQueEstaInscrito;

    public Aluno(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
        this.turmasEmQueEstaInscrito = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Turma> getTurmasEmQueEstaInscrito() {
        return turmasEmQueEstaInscrito;
    }


}
