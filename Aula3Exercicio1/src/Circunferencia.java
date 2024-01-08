
public class Circunferencia {
    private double raio = 1;
    private String color = "Verde";


    public Circunferencia(){}

    public Circunferencia(double raio){
        this.raio = raio;
    }

    public Circunferencia(double raio, String color){
        this.raio = raio;
        this.color = color;
    }

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        double area;
        double pi = Math.PI;
        area = pi * raio * raio;
        return area;
    }

    public double getPerimeter(){
        double perimeter;
        double pi = Math.PI;

        perimeter = 2 * pi * raio;

        return perimeter;
    }
}
