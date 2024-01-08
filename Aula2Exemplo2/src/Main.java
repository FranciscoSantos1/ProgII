import listaContactos.*;

public class Main {
    public static void main(String[] args) {
        Pessoa p1, p2 , p3;
        Contacto x, y, z;

        p1 = new Pessoa("Ana");
        x = new Contacto(p1, "938129313", TipoContacto.telefone);
        y = new Contacto(p1, "ana@ipvc.pt", TipoContacto.email);
        p1.getContactos().add(x);
        p1.getContactos().add(y);

        System.out.println("X: " + x.getPessoa().getNome());

        for(Contacto i : p1.getContactos()){
            System.out.println(i.getTipo() + ": " + i.getDescricao());
        }
    }
}