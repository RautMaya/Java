import java.util.Scanner;
class WeekDays
{
public static void main(String[] args)
{
int Day;

Scanner Scan =new Scanner(System.in);

System.out.println("Enter a Week of Day Number : ");
Day=Scan.nextInt();

switch(Day)
{
case 1:
System.out.println("Sunday");
break;

case 2:
System.out.println("Monday");
break;

case 3:
System.out.println("Tuesday");
break;

case 4:
System.out.println("Wensday");
break;

case 5:
System.out.println("Thuresday");
break;

case 6:
System.out.println("Friday");
break;

case 7:
System.out.println("Saturday");
break;

default :
System.out.println("Invalid Day Of Number");
break;

}
}
}


