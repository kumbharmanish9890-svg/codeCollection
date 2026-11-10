interface Print
{
	void show();
}

class practical2
{
	public static void main(String args[])
	{
		Print obj = () -> {

			System.out.println("with Lambda Expression");
		};
		obj.show();
	}
}