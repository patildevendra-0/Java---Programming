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
            System.out.println(Brr[iCnt]+"\t");
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
    public int Last_Occurance(int iNo)
    {
        int iCnt = 0;
        int iTemp = 0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
            if(Brr[iCnt]==iNo)
            {
                iTemp = iCnt;
            }
        }
        return iTemp;
        
    }
}

class Assignment34_3
{
    public static void main(String arv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
        int iSize = sobj.nextInt();

        MarvellousX mobj = new MarvellousX(iSize);
        mobj.Accept();
        mobj.Display();
        
        System.out.println("Enter the number that you want to check :");
        int iValue = sobj.nextInt();
        
        int iRet = mobj.Last_Occurance(iValue);
        System.out.println(iValue+" is present on index :"+iRet);


    }
}