package live.learnwithchampak;

public class ResultStorage {

    static class Result {
    String name;
    int rollno,phy,chem,maths;

    public Result(String name,int rollno,int phy,int chem,int maths)
    {
        this.name=name;
        this.rollno=rollno;
        this.phy=phy;
        this.chem=chem;
        this.maths=maths;
 
    }
      
    public double getPercentage(){
        return (phy+chem+maths)/3.0;
    }

     public String getResult() {
            return (phy >= 33 && chem >= 33 && maths >= 33) ? "Pass" : "Fail";
        }
    }
     static Result[] students = {
        new Result("Aryan", 1, 80, 70, 90),
        new Result("Rahul", 2, 30, 40, 50),
        new Result("Rohit", 3, 60, 65, 70)
    };
     

    public static String checkResult(int rollno) {
        
        for(int i=0;i< students.length;i++){
            if(students[i].rollno==rollno){
                Result r=students[i];
                return "Name: " + r.name +
                        "\nMarks -> Physics: " + r.phy +
                        ", Chemistry: " + r.chem +
                        ", Maths: " + r.maths +
                        "\nPercentage: " + r.getPercentage() +
                        "\nResult: " + r.getResult();
            }
        }
        return "Student not found";
    }
     public static void main(String[] args) {
        System.out.println(checkResult(1));
    }
}