import listaContatos.*;

public class Main {
    public static void main(String[] args) {
        Contacto x, y;

        x = new Contacto("Jose", "938821283");
        y = new Contacto("Maria", "912319230");
        x.setEmail("jose@gmail.com");
        y.setEmail("maria@gmail.com");

        System.out.println("Contacto 1: " + x.getName() + "/ " + x.getTel() + "/ " + x.getEmail());
        System.out.println("Contacto 2: " + y.getName() + "/ " + y.getTel() + "/ " + y.getEmail());
    }

}