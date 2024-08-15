import java.util.Scanner;
class Addition
{
public static void main(String[] args)
{
int num1,num2,Answer;
num1=5;
num2=6;
Answer=num1+num2;
System.out.println("You Enter Number is Sum = \n"+Answer);

Scanner scan=new Scanner(System.in);
System.out.println("Enter First Numbers");
num1=scan.nextInt();

System.out.println("Enter Secound Numbers");
 num2=scan.nextInt();


Answer=num1+num2;
System.out.print(Answer);

}
}