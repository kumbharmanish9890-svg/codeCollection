interface interface1 {

    public int a = 10;
    public void disp();
}
/**
 * add extends interface1
 *  */
interface interface2
{   
    public int b = 39;
       
}
class mult implements interface1,interface2 
 {

   public void disp()
    {
        System.out.println(a*b);
    }

    
}
class interface1Java{
    public static void main(String args[])
    {
        mult ob = new mult();
        ob.disp();

    }
}
