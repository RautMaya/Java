import java.util.Scanner;
class Score
{
public static void main(String[] args)
{
int Mark;

Scanner scan=new Scanner(System.in);

System.out.println("Enter Score Number");
Mark=scan.nextInt();

switch(Mark)
{
case 90:
System.out.println("Very good");
break;

case 80:
System.out.println(" good");
break;


case 60:
System.out.println("Average");
break;


case 40:
System.out.println("Need To Be Progress");
break;


default:
System.out.println("Not To Enter Score");
break;

}
}
}