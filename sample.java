import java.util.*;
class sample{

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];
      //  arr[1] = 10;
        
      for(int i = 0;i<=2;i++)
      {

        for(int j = 0;j<=2;j++)
        {
            arr[i][j] = sc.nextInt();
        }
      }

        for(int i = 0 ;i<=2;i++)
        {
            for(int j = 0;j<=2;j++)
            {
               if(arr[i] != arr[j])
               {
                 System.out.print(arr[i][j]);
               }

            }
            System.out.println();
        }
    }
}