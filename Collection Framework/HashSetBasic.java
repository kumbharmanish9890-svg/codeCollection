import java.util.*;
class HashSetBasic
{
	public static void main(String args[])
	{

		Set<Integer> st1 = new HashSet<>();
		Set<Integer>st2 = new HashSet<>();

		st1.add(59);
		st1.add(69);
		st1.add(59);

		st2.add(78);
		st2.add(59);
		st2.add(68);

		st1.retainAll(st2);

		System.out.println(st1);





		System.out.println(st1);
	}
}