
public class Main {
    public static void main(String[] args) {
        /*Automovel a1, a2;

        a1 = new Automovel("Opel");
        a1.setModelo("Corsa");
        a1.setCor("Amarelo");
        a1.setCilindrada((float)1288.51);
        a1.setCv(75);

        a2 = new Automovel("Citroen", "C3");

        System.out.println("a1 = " + a1.getMarca() + ", " + a1.getModelo() + ", " + a1.getCor() + ", " + a1.getCilindrada() + "cm3 , " + a1.getCv() + "cv");
        System.out.println("a2 = " + a2.getMarca()+ " " + a2.getModelo());*/

        int[] a = {5, 3, 7, 8, 1, 2, 13, 15, 8, 19, 21, 41, 61, 71};

        for(int i = 0; i < 14; i++){
            System.out.print(a[i]);
        }

        System.out.println();

        for(int n : a){
            System.out.print(n);
        }

    }
}