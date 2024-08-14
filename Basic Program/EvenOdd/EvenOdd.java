import java.util.Scanner;
class EvenOdd
{
public static void main(String[] args)
{
int Num;

Scanner scan=new Scanner(System.in);

System.out.println("Enter a  Number  =");
Num=scan.nextInt();

if(Num /2==0)
{
System.out.println("Given Number is Even Number ");
}
else
{
System.out.println("Given Number is Odd Number ");
}
}
}