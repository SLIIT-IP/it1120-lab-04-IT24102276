import java.util.Scanner;

public class IT24102276Lab4Q1{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double number;

System.out.print("Enter a number:");
number = input.nextDouble();

if(number < 0)
{
System.out.print("The number is: Negative");
}

else if(number > 0)
{
System.out.print("The number is: Positive");
}

else
{
System.out.print("The number is zero");
}
}
}