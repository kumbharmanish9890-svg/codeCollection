import java.util.Scanner;
class LinearSearch
{
    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == target) 
            {
                return i;          // Return the index if the target is found
            }
        }
        return -1;                // Return -1 if the target is not found
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);


	System.out.print("Roll No: 315826023\n");
	System.out.print("Name:Manish Kumbhar\n");

        // Input for array size
        
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        
        // Input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) 
        {
            array[i] = sc.nextInt();
        }
        // Input for target value
        System.out.print("Enter the target value to search for: ");
        int target = sc.nextInt();

        // Perform linear search
        int result = linearSearch(array, target);

        // Output the result
        if (result != -1) 
	{
            System.out.println("Element found at index: " + result);
        } 
	else 
	{
            System.out.println("Element not found in the array.");
        }
     }
}
