class StudentDetails03
{ 
int Id;
String Name;

public void display()
{

System.out.println("Student Id=" +Id );
System.out.println("Student Name=" +Name);
}
 public static void main(String[] args)
{

StudentDetails03 Obj=new StudentDetails03();
StudentDetails03 Obj1=new StudentDetails03();

Obj.display();
Obj1.display();
}
}
