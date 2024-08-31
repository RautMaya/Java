import java.util.Scanner;
class LCM
{
public static void main(String[] args)
{
int n1,n2,gcd,lcm;

Scanner scan=new Scanner(System.in);

System.out.println("\n Enter First Number :");
n1=scan.nextInt();

System.out.println("\n Enter Secound Number :");
n2=scan.nextInt();

gcd=findgcd(n1,n2);
lcm=(n1*n2)/gcd;

System.out.println("The LCM of Given Number is   " +lcm);
}

public static int findgcd(int a,int b)
{
if(b==0)
return a;
return findgcd(b , a % b);
}
}





