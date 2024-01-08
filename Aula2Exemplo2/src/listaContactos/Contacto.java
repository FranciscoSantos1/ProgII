package listaContactos;

public class Contacto {
    private Pessoa pessoa;
    private String descricao;
    private TipoContacto tipo;

    public Contacto(Pessoa pessoa, String descricao, TipoContacto tipo) {
        this.pessoa = pessoa;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoContacto getTipo() {
        return tipo;
    }

    public void setTipo(TipoContacto tipo) {
        this.tipo = tipo;
    }


}
