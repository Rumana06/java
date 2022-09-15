//fibonacci series

class Sequence
{
    public static void main (String[] args)
    {
        int f1=0, f2=1, f3=0;
        do
        {
            f3=f1+f2;
            System.out.println(f3+" ");
            f1=f2;
            f2=f3;
        }while(f3 <=55);
    }
}