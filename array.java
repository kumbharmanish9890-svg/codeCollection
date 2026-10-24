import java.util.*;

class array
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);

       

        int[] num = {34,53,88,56,88,67,54};

        System.out.print("Enter favourite number");
        int ch = sc.nextInt();

        for(int i = 0;i<num.length;i++)
        {
            if(num[i]==ch)
            {
                System.out.println("Index = " + i);
           }
        }
        
    }
}