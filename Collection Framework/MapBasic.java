import java.util.*;
class MapBasic
{
	public static void main(String args[])
	{
		Map<String,String> mapping = new HashMap<>();

		mapping.put("eng","English");
		mapping.put("mar","Marathi");
		mapping.put("hin","Hindi");

		System.out.println(mapping);


		Map<String,String> table = new HashMap<>();

		table.put("br","Brazil");

		table.putAll(mapping);


		table.remove("hin");

		//table.clear();

		System.out.println(mapping.size());


		System.out.println(mapping.get("mar"));

		System.out.println(table);



	}
}