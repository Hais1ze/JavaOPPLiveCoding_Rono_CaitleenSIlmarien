package labrecord;
public class LR {
  private String studentName;
    private int score;
    private int LabScore;
    
    public LR(String studentName, int score, int LabScore){
        this.studentName=studentName;
        if (score>=0&&score<=100){
            this.score=score;
        }
        else{
            this.score=0;
        }
             if (LabScore>=0&&LabScore<=100){
                 this.LabScore=LabScore;
             }
             else{
                 this.LabScore=0;
             }
    }
    public boolean updatedscores(int score, int LabScore){
        if (score<0||score>100||LabScore<0||LabScore>100){
            return false;
        }
        this.score=score;
        this.LabScore=LabScore;
        return true;
    }
    public double finalGrade(){
        return (this.score*0.40)+ (this.LabScore*0.60);
    }
    public boolean passing(){
        return finalGrade ()>=75.0;
    }
    public String GetStudentName(){
        return this.studentName;
    }  
}
