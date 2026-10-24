class comp
{
    int num = 5;
    public int get1(int n1 , int n2)
    {
        System.out.println(num);
        return n1 + n2  + num;
    }

}
class Demo
{
    public static void main(String args[])
    {
        comp o = new comp();
        int r1 = o.get1(20,10); 
        System.out.println(r1);
    }
    
    
}