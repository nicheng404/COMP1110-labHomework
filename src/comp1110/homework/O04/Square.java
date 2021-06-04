package comp1110.homework.O04;

public class Square extends Shape {

    double length;


    public Square(double length) {
        this.length = length;
    }

    public Square(double length, double x, double y) {
        this.length = length;
        this.x = x;
        this.y = y;

    }


    @Override
    double perimeter() {
        return 4 * this.length;
    }

    @Override
    double area() {
        return (this.length) * this.length;
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
