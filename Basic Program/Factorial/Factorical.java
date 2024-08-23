import java.util.Scanner;
class Factorical
{
public static void main(String[] args)
{
int No=0, Fact=1,Temp=0;

Scanner Scan=new Scanner(System.in);

System.out.println("Enter a Number");
 No=Scan.nextInt();

for(Temp=No,Fact=1;Temp>1;Temp--)
          {
            Fact=Fact*Temp;
          }


System.out.println(Fact);
}
}


