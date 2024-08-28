import java.util.Scanner;
class Table
{
public static void main(String[] args)
{
int Num,i;

Scanner scan =new Scanner(System.in);

System.out.println("Enter a Integer Number");
Num=scan.nextInt();

for(i=1;i<Num;i++)
{
System.out.println(Num*i);
}
}
}