package entities;

public class retangulo{

    public double width;
    public double height;

    public double area(){
        return width * height;
        
    }

    public double perimetro(){

        return 2*(width + height);
    }

    public double diagonal(){
        return Math.sqrt(height * height + width * width);
    }
}