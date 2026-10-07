interface sport{
    float sportwt = 5.6F;
    void putwt();
}
class stu
{
    int ro;

    void get(int a)
    {
        ro = a;
    }
   void  put()
   {
        System.out.println("Roll No = " + ro);
   }
}
class test extends stu{
    float part1,part2;

    void getM(float a , float b)
    {
        part1 = a;
        part2 = b;
    }
    void putM()
    {
        System.out.println("Marks English = " + part1);
        System.out.println("Marks Hindi = "+ part2);
    }
} 
class result extends test implements sport
{
    float total;

    public void putwt()
    {
        System.out.println("sportWt = " + sportwt);
    }
    void disp()
    {

        total = part1 +  part2;
        put();
        putM();
        putwt();
        System.out.println("Total = " + total);
        

    }


}
class interfaceInJava
{

    public static void main(String args[])
    {
        result r = new result();
        r.get(202);
        r.getM(45.5F,44.0F );
        r.disp();

    }

}