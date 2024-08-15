import java.util.Scanner;
class Subtraction
{
public static void main(String[] args)
{
int num1,num2,Sub;

Scanner scan=new Scanner(System.in);

System.out.println("Enter First Number =");
num1=scan.nextInt();

System.out.println("Enter Secound Number =");
num2=scan.nextInt();

Sub=num1-num2;
System.out.println("The Subtraction Of Given Two Number is =" +Sub);
}
}