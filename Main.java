import java.util.*;
class get1
{
	Scanner sc = new Scanner(System.in);

	int n1;
	get1()
	{
		System.out.println("Enter n1 = ");
		n1 = sc.nextInt();
	}
}
class get2 extends get1
{
	int n2;
	void data()
	{
		System.out.println("Enter n2 = ");
		n2 = sc.nextInt();
	}
	void calc()
	{
		int ans = n1 + n2;
		System.out.println(ans);
	}


}
class Main
{
	public static void main(String args[])
	{

		get2 obj = new get2();
		obj.data();
		obj.calc();

	}
}