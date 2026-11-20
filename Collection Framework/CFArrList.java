import java.util.*;
public class CFArrList {

	public static void main(String args[])
	{

		ArrayList<Integer> list = new ArrayList<>();

		list.add(100);
		list.add(200);
		list.add(300);

		System.out.println(list.get(0));
		System.out.println("Before List = " + list);
		list.set(1,400);
		System.out.println("After List = " + list);

	//toArray();

		Object[] arr = list.toArray();
		for(Object obj : arr)
		{
			System.out.println(obj);
		}

	//Contain()

		System.out.println(list.contains(88));

	}


}
