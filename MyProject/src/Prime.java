import Demopackagename.classnew;
public class Prime extends Primeexample {
	static
	{
		int val=10;
		System.out.println(val);
	}
	public static void newmethod(int val)
	{
		System.out.println(" This is new number: "+val);
	}
	public static void main(String args[])
	{
		Prime obj=new Prime();
		classnew obj1=new classnew();
		obj1.methodname();
		obj.setname("jaisri");
		System.out.println(" "+obj.getname());
		obj.setnumber(43);
		System.out.println(" "+obj.getnumber());
		 newmethod(12);
		 obj=null;
		 System.gc();
	}
	protected void finalize() throws Throwable
	 {
		 System.out.println("Garbage collection is performed by JVM");
	 }

}
