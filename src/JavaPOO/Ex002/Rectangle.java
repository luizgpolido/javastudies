package JavaPOO.Ex002;

public class Rectangle {
    public double witdh;
    public double height;

    public double Area(){
        return witdh * height;
    }

    public double Perimeter(){
        return witdh * 2 + height * 2;
    }

    public double Diagonal(){
        return Math.sqrt(witdh * witdh + height * height);
    }


}
