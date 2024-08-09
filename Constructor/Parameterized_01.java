class Student
{
int RollNo;
String Name;

public static void display()
{
System.out.println(RollNo+""+Name);
}

Student()
{
System.out.println("Default :: Constructor");
}

Student(int i ,String n )
{
RollNo=i;
Name=n;
System.out.println("Parameterized :: Constructor");
}
 
public static void main(String[] args)
{
Student s1=new Student();
s1.diaplay();

}
}

