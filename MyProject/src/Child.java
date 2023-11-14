
class Child extends Mywork {
	
	@Override
	public void mymethod()
	{
		System.out.println("The work is smooth going");
	}
	public static void main(String args[]) {
		
		System.out.println("Its inside main");
		Child obj=new Child();
		obj.mymethod();
		obj.jogging();
		
	}
	
}
