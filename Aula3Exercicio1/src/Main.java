public class Main {
    public static void main(String[] args){
        Retangulo r1, r2;
//
//        r1 = new Retangulo();
//        r2 = new Retangulo(5, 10);
//        r1.setColor("Vermelho");
//        r2.setColor("Azul");
//
//        System.out.println("Area of r1: " + r1.getArea());
//        System.out.println("Area of r2: " + r2.getArea());
//        System.out.println("Perimeter of r2: " + r2.getPerimeter());
//        System.out.println("Perimeter of r2: " + r2.getPerimeter());
//        System.out.println("Color of r1: " + r1.getColor());
//        System.out.println("Color of r2: " + r2.getColor());
//
//        Circunferencia c1, c2;
//
//        c1 = new Circunferencia();
//        c2 = new Circunferencia(5, "Amarelo");
//
//        System.out.println("C1: " + c1.getRaio() + " " + c1.getColor());
//        System.out.println("C2: " + c2.getRaio() + " " + c2.getColor());
//        System.out.println("Area de C1: " + c1.getArea());
//        System.out.println("Area de C2: " + c2.getArea());
//        System.out.println("Perimetro de C1: " + c1.getPerimeter());
//        System.out.println("Perimetro de C2: " + c2.getPerimeter());

        Quadrado q1, q2;

        q1 = new Quadrado(5, "Azul");
        q2 = new Quadrado(7.5, "Verde", "Quadrado 2");

        q1.setLegenda("Quadrado 1");

        System.out.println("Lado do Q1: " + q1.getLegenda() + q1.getLado());
        System.out.println("Area do Q1: " + q1.getLegenda() + q1.getArea());
        System.out.println("Perim. do Q1: " + q1.getLegenda() + q1.getPerimeter());


        System.out.println("Lado do Q2: " + q2.getLado());
        System.out.println("Area do Q2: " + q2.getArea());
        System.out.println("Perim. do Q2: " + q2.getPerimeter());
    }
}
