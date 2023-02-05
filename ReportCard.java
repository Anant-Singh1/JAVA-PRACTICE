// Assignment -2 
// Print Student Report Card
// RollNo - 1001
// Take Name - Amit Srivastava 
// Take 3 Subject Marks
// 90
// 100 
// 88
// Compute Total Marks
// Compute Percentage
// Print Grade
// >90 A Grade
// <90 to >=70 B Grade
// <70 to>=60 C Grade
// <60 to>=50 D Grade
// <50 F Grade

class Student{
    private int rollNumber;
    private String name;
    private int subject1;
    private int subject2;
    private int subject3;
    private char grade;

    public void takeInput(int rollNumber,String name,int subject1, int subject2,int subject3){
        this.name=name;
        this.rollNumber=rollNumber;
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    public double Percentage(){
        double percent=((subject1+subject2+subject3)*100)/300;
        return percent;
    }
    public void getGrade(){
        if(Percentage()>90)
        grade='A';
        else if(Percentage()<90 && Percentage()>=70)
        grade='B';
        else if(Percentage()<70 && Percentage()>=60)
        grade='C';
        else if(Percentage()<60 && Percentage()>=50)
        grade='D';
        else
        grade='F';
    }
    public void printReport(){
        System.out.println("Name of Student--"+name);
        System.out.println("Roll Number--"+rollNumber);
        System.out.println("Subject One--"+subject1);
        System.out.println("Subject Two--"+subject1);
        System.out.println("Subject Three--"+subject1);
        System.out.println("Percentage--"+Percentage());
        System.out.println("Grade--"+grade);
    }
}
public class ReportCard {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.takeInput(1, "Harry Lewis", 88, 98, 90);
        s1.getGrade();
        s1.printReport();
    }
}
