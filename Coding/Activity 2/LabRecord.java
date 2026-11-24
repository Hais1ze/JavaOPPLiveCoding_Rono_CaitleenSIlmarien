package labrecord;
public class LabRecord {
public static void main(String[] args) {
         LR Ana=new LR("Ana", 80, 90);
    LR Ben=new LR("Ben", 101, 85);
        System.out.println(Ana.GetStudentName()+" : "+Ana.finalGrade());
        System.out.println("Passed: "+Ana.passing());
        System.out.println(Ben.GetStudentName()+" : "+Ben.finalGrade());
        System.out.println("Passed: "+Ben.passing());
         System.out.println("Update Ana to 95 and 101: " + Ana.updatedscores(95, 101));
        System.out.println("Ana: " + Ana.finalGrade());

        System.out.println("Update Ana to 74 and 75: " + Ana.updatedscores(74, 75));
        System.out.println("Ana: " + Ana.finalGrade());
        System.out.println("Passed: " + Ana.passing());

        System.out.println("Update Ana to 75 and 75: " + Ana.updatedscores(75, 75));
        System.out.println("Ana: " + Ana.finalGrade());
        System.out.println("Passed: " + Ana.passing());

        System.out.println("Ben again: " + Ben.finalGrade());
        System.out.println("Passed: " + Ben.passing());
    }
/*
Why must you validate both new scores before assigning either one?
To make sure both scores are valid before updating.
This prevents one score from changing if the other one is invalid.
*/
    
}
