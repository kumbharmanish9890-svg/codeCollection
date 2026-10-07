class arr1
{
    public static void main(String args[])
    {

        int arr[][] = new int[3][4];
        try
        {
        for(int i= 0;i<3;i++)
        {
            for(int j = 0;j<4;j++)
            {
                arr[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int i= 0;i<3;i++)
        {
            for(int j = 0;j<4;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    catch(Exception ex)
    {
        System.out.println(ex.getMessage());
    }
    }
    
}