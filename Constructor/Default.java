class Constructor
{
int Id=102;
String Name="Prashant";

Constructor()
{
System.out.println("Default :: Constructor"  +Id +   "and"  +Name);
Id=101;
Name="Suchita";
}

public static void main(String[] args)
{
Constructor Obj=new Constructor();
System.out.println("Student Roll No" +Obj.Id);
System.out.println("Student Name"  +Obj.Name);
}
}