
public class example implements Myself {
	@Override
	public void method()
	{
		System.out.println("Implemented an interface class method");
	}
	public void student()
	{
		System.out.println("Its student method");
	}
	public static void main(String args[])
	{
		System.out.println("Hello world");
		example obj=new example();
		obj.method();
		obj.student();
	}
	

}
