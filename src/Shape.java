import java.lang.classfile.Interfaces;

interface  Shapei {
    double area();

}
class circle implements Shapei{
    double radius;
    circle(double radius) {
        this.radius=radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}
class rectangle implements Shapei{
    double height;
    double width;
    rectangle(double height,double width) {
        this.height=height;
        this.width=width;
    }

    @Override
    public double area() {
        return height*width;
    }
}
public class Shape{
    public static void main(String[] args) {
        Shapei[] shapes=new Shapei[2];
        shapes[0]=new circle(5);
        shapes[1]=new rectangle(4,6);
        for(Shapei s:shapes){
            System.out.println("Area: "+s.area());
        }
    }
}
