class age
{
    public void herage()
    {
        System.out.println("Her age is 20");
    }
}
class myage extends age
{
    public void myagee()
    {
        System.out.println("My age is 19");
    }
}
public class inheritance
{
    public static void main(String[] args)
    {
        myage a1=new myage();
        a1.herage();
        a1.myagee();
    }
}