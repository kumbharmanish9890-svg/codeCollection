interface Demo
{
	void disp(int a , int b);
}
class Practical3
{
	public static void main(String args[])
	{
		Demo obj = (a,b) -> {


			System.out.println("addtion = " + (a+b));
		};
		obj.disp(23,56);

	}
}