package comp1110.homework.O04;

public class Circle extends Shape{
    double length;




    public Circle(double length) {
        this.length = length;
    }

    public Circle(double length, double x, double y) {
        this.length = length;
        this.x = x;
        this.y = y;

    }

    @Override
    double perimeter() {
        return 2*Math.PI*this.length;
    }

    @Override
    double area() {
        return Math.PI*(this.length)*(this.length);
    }

    @Override
    boolean overlaps(Shape other) {
        boolean result = false;
        if(other.x==this.x&&other.y==this.y){
            result = true;
        }

        return result;
    }
}
