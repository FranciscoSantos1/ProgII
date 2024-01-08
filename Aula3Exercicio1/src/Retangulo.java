public class Retangulo {
    protected double height;
    protected double width;
    protected String color = "White";


public Retangulo(){
    width = 1;
    height = 2;
    color = "White";
}

public Retangulo(double width, double height){
    this.width = width;
    this.height = height;
    this.color = "White";
}

public double getHeight(){
    return height;
}

public void setHeight(double height){
    this.height = height;
}

public double getWidth(){
    return width;
}
public void setWidth(double width){
    this.width = width;
}

public String getColor(){
    return color;
}

public void setColor(String color){
    this.color = color;
}

public double getArea(){
    double area;
    area = width * height;
    return area;
}

public double getPerimeter(){
    double perimeter;
    perimeter = (2 * width) + (2 * height);
    return perimeter;
}
}


