import java.util.Scanner;
class PrintNumbers
{
public static void main(String[] args)
{
int Num,i;

Scanner scan=new Scanner(System.in);

System.out.println("\n Enter a Integer Number \n");
Num=scan.nextInt();

for(i=1;i<=Num;i++)
{
System.out.println(i);
}
}
}