import java.util.Scanner;
class PositiveNegative
{
public static void main(String[] args)
{
int Num;

Scanner scan=new Scanner(System.in);

System.out.println("Enter a  Number  =");
Num=scan.nextInt();

if(Num > 0)
{
System.out.println("Given Number is Positive " +Num);
}
else
{
System.out.println("Given Number is Negative " +Num);
}
}
}