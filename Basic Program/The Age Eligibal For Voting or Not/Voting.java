import java.util.Scanner;
class Voting
{
public static void main(String[] args)
{
int age;

Scanner scan=new Scanner(System.in);

System.out.println("Enter Your age =");
age=scan.nextInt();

if(age >=18)
{
System.out.println("Your are Eligibal For Voting ");
}
else
{
System.out.println("Your are Not Eligibal For Voting ");
}
}
}