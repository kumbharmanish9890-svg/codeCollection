import java.util.*;
class CFMethods
{
	public static void main(String args[])
	{

		ArrayList<Integer> list = new ArrayList<>();
		//Collection<Integer> collection = new ArryaList<>();
		//List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(30);
		list.add(40);

		System.out.println(list);

		list.add(20);

		System.out.println(list);

		System.out.println("Size of List = " + list.size());

		ArrayList<Integer> list2 = new ArrayList<>();

		list2.add(35);
		list2.add(45);

		list.addAll(list2);

		System.out.println(list);

		list.remove(0);

		System.out.println(list);

		list.removeAll(list2);

		System.out.println(list2);

		System.out.println(list);

		list2.clear();

		System.out.println(list2);

		 Iterator<Integer> iterator = list.iterator();

		 while(iterator.hasNext())
		 {

				System.out.println("Elements : " + iterator.next());
		}

	}
}