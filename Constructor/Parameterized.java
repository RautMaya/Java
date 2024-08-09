class Parameterized
{
int Id;
String Name;

Parameterized()
{
System.out.println(" Default :: Costructor" +Id);
Id=111;
}

Parameterized(int i,String n)
{
Id=i;
Name=n;
System.out.println("Parameterized :: Constructor" +i  +n);
Id=222;
}

public static void main(String[] args)
{
Parameterized Obj1=new Parameterized();

System.out.println("Id of Default Constructor" +Obj1.Id);

Parameterized Obj2=new Parameterized(555,"Prashant");
Parameterized Obj3=new Parameterized(999,"Sayli");


}
}