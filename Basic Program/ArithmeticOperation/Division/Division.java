import java.util.Scanner;
class Division
{
public static void main(String[] args)
{
int num1,num2,Div;

Scanner scan=new Scanner(System.in);

System.out.println("Enter First NUmber =");
num1=scan.nextInt();

System.out.println("Enter Secound NUmber =");
num2=scan.nextInt();

Div=num1/num2;
System.out.println("Division Of Given Two Number is =" +Div);
}
}
