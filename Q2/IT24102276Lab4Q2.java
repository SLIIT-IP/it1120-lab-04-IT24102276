import java.util.Scanner;

public class IT24102276Lab4Q2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double ExamMarks, LabMarks, ExamPer, LabPer, Final;

System.out.print("Please enter exam marks(Out of 100): ");
ExamMarks = input.nextDouble();

if(ExamMarks > 100)
{
System.out.print("Invalid input for exam marks. Terminating program");
}
else 
{
System.out.print("");
}

System.out.print("Please enter lab submission marks(Out of 100): ");
LabMarks = input.nextDouble();

if(LabMarks > 100)
{
System.out.print("Invalid input for exam marks. Terminating program");
}
else 
{
System.out.print("");
}

System.out.print("Please enter the percentage given for the exam: ");
ExamPer = input.nextDouble();

if(ExamPer > 100)
{
System.out.print("The percentages must add up to 100. Terminating program");
}
else 
{
System.out.print("");
}

System.out.print("Please enter the percentage given for the lab submission: ");
LabPer = input.nextDouble();

if(LabPer > 100)
{
System.out.print("The percentages must add up to 100. Terminating program");
}
else 
{
System.out.print("");
}

Final = (ExamMarks*ExamPer/100) + (LabMarks*LabPer/100);

System.out.print("Final exam mark is: "+ Final);

}
}