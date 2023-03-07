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
    public void Display(int iStart,int iEnd)
    {
        int iCnt = 0;
        System.out.println("Elements of array are:");
        for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
            if((Brr[iCnt]>iStart)&&(Brr[iCnt]<iEnd))
            {
                System.out.print(Brr[iCnt]+"\t");
            }
        }
        System.out.println();
    }
}

class Assignment34_5
{
    public static void main(String arv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
        int iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();
        System.out.println("Enter the starting point of range:");
        int iStart = sobj.nextInt();
        System.out.println("Enter the end point of range:");
        int iEnd = sobj.nextInt();
        aobj.Display(iStart,iEnd);
    }
}