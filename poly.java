class  clac
{
	int add(int a,int b)
	{

		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	double add(double a , double b)
	{
		return a+b;
	}
}
class poly
{
	public static void main(String args[])
	{
		clac obj = new clac();
		System.out.println(obj.add(45,78));
		System.out.println(obj.add(23,32,10));
		System.out.println(obj.add(99.89,67.77));
	}
}