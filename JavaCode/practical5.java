//Funtion Interface

@FunctionalInterface
interface square
{
	int calc(int n);
}
class practical5
{

	public static void main(String args[])
	{
		square s = n -> n*n;

		System.out.println(s.calc(6));
	}

}