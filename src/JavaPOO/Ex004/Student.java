package JavaPOO.Ex004;

public class Student {
    public String name;
    public float firstGrade;
    public float secondGrade;
    public float thirdGrade;

    public float finalGrade(){
        return firstGrade + secondGrade + thirdGrade;
    }

    public double missingPoints(){
        if (finalGrade() < 60){
            return 60.0 - finalGrade();
        } else {
            return 0;
        }

    }

}
