import java.util.Scanner;

public class IT24102276Lab4Q3{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double number;

System.out.print("Enter a number:");
number = input.nextDouble();

String result = (number > 0) ? "Positive" : (number < 0)? "Negative" : "Zero";

System.out.println("The number is:" + result);
}
}