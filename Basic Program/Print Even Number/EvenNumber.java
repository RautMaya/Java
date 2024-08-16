import java.util.Scanner;
class EvenNumber
{
public static void main(String[] args)
{
int Num,Range;

Scanner scan=new Scanner(System.in);
System.out.println("Enter Number =");
Range=scan.nextInt();

for(Num=0;Num<=Range;Num++)
{
if(Num%2==0)
{
System.out.println("\n" +Num);
}
}
}
}