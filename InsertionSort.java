class InsertionSort
{

	public static void insert_Sort(int[] arr)
	{

		int n = arr.length;

		for(int i=1;i < n;i++)
		{
			int key = arr[i];
			int j=i-1;

			while(j>= 0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

	public static void printArray(int[] arr)
	{
		for(int num : arr)
		{
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{

		System.out.println("Name : Manish Kumbhar");
		System.out.println("Roll No : 23\n");

		int[] arr = {64 , 34,25,12,22,11,90};

		System.out.println("Original Sort");
		printArray(arr);
		insert_Sort(arr);

		System.out.println("sorted Array");
		printArray(arr);

	}
}