import java.util.Scanner;

class ArrayX
{
    protected int Brr[];
    public ArrayX(int iSize)
    {
        Brr = new int[iSize];
    }
    protected void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt= 0;
        System.out.println("Enter the "+Brr.length+" Elements :");

        for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }
    }
    protected void Display()
    {
        int iCnt = 0;
        System.out.println("Elements of array are:");
        for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
            System.out.print(Brr[iCnt]+"\t");
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
    public int Product_Odd()
    {
        int iCnt = 0;
        int iMul = 1;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
            if(Brr[iCnt]%2!=0)
            {
                iMul = iMul * Brr[iCnt];
            }
        }
        if(iMul==1)
        {
            return 0;
        }
        
        else
        {
            return iMul;
        }
    }
}

class Assignment34_6
{
    public static void main(String arv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
        int iSize = sobj.nextInt();

        MarvellousX mobj = new MarvellousX(iSize);
        mobj.Accept();
        mobj.Display();
        
        int iRet = mobj.Product_Odd();
        System.out.println("product of all odd elements int given array is: "+iRet);
        


    }
}