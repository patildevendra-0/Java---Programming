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
        int iCnt= 0;
        System.out.println("Enter the "+Arr.length+" Elements :");

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    protected void Display()
    {
        int iCnt = 0;
        System.out.println("Elements of array are:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]+"\t");
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
    public int Diff_Summation()
    {
        int iCnt = 0;
        int iEvenSum = 0 , iOddSum = 0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]%2==0)
            {
                iEvenSum = iEvenSum+Arr[iCnt];
            }
            else 
            {
                iOddSum = iOddSum+Arr[iCnt];
            }
        }
        return (iEvenSum-iOddSum);
    }
    
}

class Assignment32_1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int iSize = sobj.nextInt();

        MarvellousX mobj = new MarvellousX(iSize);
        mobj.Accept();
        mobj.Display();

        int iRet = mobj.Diff_Summation();
        System.out.println("Difference between Evn summation and Odd Summation is : "+iRet);
    }
}