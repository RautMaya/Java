import java.util.Scanner;
class Multiplication
{
public static void main(String[] args)
{
int n1,n2,Answer;

Scanner scan=new Scanner(System.in);

System.out.println("Enter First Number :");
n1=scan.nextInt();

System.out.println("Enter Secoud Number");
n2=scan.nextInt();
Answer=n1*n2;
System.out.println("The Sum Of Two Number is = " +Answer);
}
}