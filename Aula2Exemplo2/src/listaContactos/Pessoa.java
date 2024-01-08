package listaContactos;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
     List<Contacto> contactos;

    public Pessoa(String nome){
        contactos = new ArrayList<>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }
}
