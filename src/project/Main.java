package project;

public class Main {
    public static void main (String args[]){
        Student obj= new Student();
        obj.setEnglishMarks(22);
        obj.setHindiMarks(1);
        obj.setMathsMarks(23);
        System.out.println(obj.checkResult());
        System.out.println(obj.checkPassOrFail());
    }
}
class Student{
    private int rollNo;
    private String name;
    private int englishMarks, hindiMarks, mathsMarks;

    public String getName() {
        return name;
    }
    public void setName (String str){
        name = str;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getHindiMarks() {
        return hindiMarks;
    }

    public void setHindiMarks(int hindiMarks) {
        this.hindiMarks = hindiMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }
    public double checkResult(){
        double sum = (double)(englishMarks+ hindiMarks+ mathsMarks)/(double)3;
        return sum;
    }
    public boolean checkPassOrFail(){
        double total = this.checkResult();
        if(total<33& total>=0){
            return false;
        }else if(total>=33& total<=100){
            return true;
        }
        return false;
    }

}


