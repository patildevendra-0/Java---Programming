import java.util.Scanner;

class Numbers
{
    public void Factors(int iNo)
    {
        int iCnt = 0;
        for(iCnt=1;iCnt<=(iNo/2);iCnt++)
        {
            if(iNo%iCnt==0)
            {
                System.out.println("Factors are: "+iCnt);
            }
        }
    }
}

class pra2 
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.Factors(iValue);
    }
}