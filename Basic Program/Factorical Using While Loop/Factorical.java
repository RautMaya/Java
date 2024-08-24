import java.util.Scanner;
class Factorical
{
public static void main(String[] args)
{
int Temp,No,Fact=1;

Scanner Scan=new Scanner(System.in);

System.out.println("Enter a Number");
No=Scan.nextInt();
No=Temp;

if(No>1)
{
      while(Temp>1)
        {
          Fact=Fact*Temp;
         Temp--;
         }

System.out.println("Factorical is "+Fact);
}
else
{
  System.out.println("Invalid Number");
}
}
}
