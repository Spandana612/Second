class ArithOp
{
int a=12;
int b=10;
int c;
 
public static void main(String a[])
{
	ArithOp o1=new ArithOp();
	o1.add();
      o1.sub();
      o1.mul();
      o1.mod();
	ArithOp.message();
}
public void add()
{
	c=a+b;
	System.out.println("Sum:"+c);
}
public void sub()
{
	c=a-b;
	System.out.println("Sub:"+c);
}
public void mul()
{
	c=a*b;
	System.out.println("mul:"+c);
}
public void mod()
{
	c=a%b;
	System.out.println("mod:"+c);
}
public static void message()
{
System.out.println("Welcome to Java");
}
 
}