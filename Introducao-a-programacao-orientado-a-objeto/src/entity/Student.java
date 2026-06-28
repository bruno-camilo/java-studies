package entity;

public class Student {
    public String name;
    public double testScore1;
    public double testScore2;
    public double testScore3;


    public double finalGrade(){
        return  testScore1  + testScore2 + testScore3 ;
    }

    public double missingPoint(){
        return  60.0 - finalGrade();
    }

    public String calculateApproval() {

        if (finalGrade() >= 60) {
            return String.format("Final Grade = %.2f%nPASS%n", finalGrade());
        } else {
            return  String.format("Final Grade = %.2f%nFAILED%nMISSING %.2f POINTS%n",finalGrade(), missingPoint());
        }
    }
}
