import java.util.Scanner;

class ArrayX
{
    protected int Arr[];
    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }
    protected void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;
        System.out.println("Enter the "+Arr.length+" Elements");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    protected void Display()
    {
        System.out.println("Elements of array are:");
        int iCnt =0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.print(+Arr[iCnt]+"\t");
        }
        System.out.println();
    }

}
class MarvellousX extends ArrayX
{
    public MarvellousX(int iSize)
    {
        super(iSize);
    }
    public void Divisible_by5()
    {
        int iCnt =0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]%5==0)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}

class Assignment32_2
{
    public static void main(String brr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int iSize = sobj.nextInt();

        MarvellousX mobj = new MarvellousX(iSize);
        mobj.Accept();
        mobj.Display();
        mobj.Divisible_by5();
    }

}