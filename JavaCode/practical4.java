interface Demo
{
	int add(int a,int b);
}
class practical4
{
	public static void main(String args[])
	{

		Demo c = (f,h) -> {

			return f+h;
		};

		System.out.println(c.add(4,78));

	}
}