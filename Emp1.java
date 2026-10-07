class emp
{
    int id ;
    String name;

    emp(int a,String b)
    {
        id = a;
        name = b;

    }
    void disp()
    {
        System.out.println("Emp Id = " + id);
        System.out.println("Emp Name = " + name);
    }
}
class dept extends emp
{
    int salary ;
    String dep;

    dept(int a,String b,int c,String d)
    {
        super(a,b);

        salary = c;
        dep = d;
    }

    void show()
    {
        disp();
        System.out.println("salary = " + salary);
        System.out.println("department = " + dep);
    }
    
}
class Emp1
{
    public static void main(String args[])
    {
        dept ob = new dept(101,"Mahesh",20000,"IT");
        ob.show();
    }

}