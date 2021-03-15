package comp1110.homework.O01;

public class BMI {
    private String name;
    private double weight;
    private double height;

    public BMI( String name, double height,double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }

    public double getBMI(){
        return weight/(height*height);
    }

    public String toString(){

        return name+" is "+height+"m tall and is "+weight+"Kg and has a BMI of "+weight/(height*height)+"Kg/m^2";
    }

    public static void main(String[] args) {

    }

}
