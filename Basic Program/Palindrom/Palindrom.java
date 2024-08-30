import java.util.Scanner;
class Palindrom
{
public static void main(String[] args)
{
int Num,Temp=0,Reverse=0,rem;

Scanner scan=new Scanner(System.in);

System.out.println("\n Enter a Integer Number :");
Num=scan.nextInt();

Num=Temp;

while(Num!=0)
{
rem=Num%10;
Reverse =Reverse*10+rem;
Num=Num/10;
}
if(Num==Reverse)
{
System.out.println("This is an Palindrom " +Temp);
}
else
{
System.out.println("This is an Palindrom " +Num);
}
}
}
