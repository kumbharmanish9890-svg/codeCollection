
import java.io.*;
class arr
{
	public static void main(String args[])throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int arr[][] = new int[3][3];

		for(int i = 0;i<=2;i++)
		{
			for(int j = 0;j<=2;j++)
			{

				arr[i][j] = Integer.parseInt(br.readLine());

			}
		}

		System.out.println("Matrix");
		for(int i = 0;i<=2;i++)
		{
			for(int j = 0;j<=2;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("transpose Matrix");
				for(int i = 0;i<=2;i++)
				{
					for(int j = 0;j<=2;j++)
					{
						System.out.print(arr[j][i]);
					}
					System.out.println();
		}
	}

}