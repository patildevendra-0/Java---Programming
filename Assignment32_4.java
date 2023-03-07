import java.io.*;

class ArrayX
{
    protected int Brr[];
    public ArrayX(int iSize)
    {
        Brr = new int[iSize];
    }
    protected void Accept() throws Exception
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        System.out.println("Enter the "+Brr.length+" Elements");
        int iCnt =0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
            Brr[iCnt] = Integer.parseInt(bobj.readLine());
        }
    }
    protected void Display()
    {
        int iCnt = 0;
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
    public void Div_3_5()
    {
        System.out.println("In Given array Divisible by 5 and 3 Numbers are:");
        int iCnt =0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
            if((Brr[iCnt]%3==0)&&(Brr[iCnt]%5==0))
            {
                System.out.print(Brr[iCnt]+"\t");
            }
        }
    }
}

class Assignment32_4
{
    public static void main(String arg[]) throws Exception
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter the size of array:");
        int iSize = Integer.parseInt(bobj.readLine());

        MarvellousX mobj = new MarvellousX(iSize);
        mobj.Accept();
        mobj.Display();
        mobj.Div_3_5();
    }
}