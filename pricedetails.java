public class pricedetails{
    public static void main(String[] args)
    {
        String[] prod ={"book","pen","pencil","eraser","scale"};
        int[] price={250,55,10,6,12};
        System.out.println("The price details of the products are:");
    
         for(int i=0;i<=5;i++)
    {
        System.out.println(prod[i]);
        System.out.println(price[i]);

    }
    }
}