interface Print
{
	void show();
}
public class practical1
{
    public static void main(String args[])
    {
        Print obj = new Print()
        {
			public void show()
			{
				System.out.println("without lambda expression");
			}
		};
		obj.show();
    }

}
