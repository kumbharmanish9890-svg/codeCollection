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


		list.add(67);
		list.add(677);
		list.add(7);

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);

		ArrayList<Integer> newList =(ArrayList<Integer>)list.clone();

		System.out.println(newList);

		ArrayList<Integer> marks = new ArrayList<>();
		marks.ensureCapacity(55);

		System.out.println(marks.isEmpty());

		System.out.println(list.indexOf(100));


	}


}
