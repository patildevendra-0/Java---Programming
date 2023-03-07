import java.io.*;

class Digits
{
    public int In_BetweenX(int iNo)
    {
        int iCount = 0;
        int iDigit = 0;

        while(iNo!=0)
        {
            iDigit = iNo%10;
            if((iDigit>3)&&(iDigit<7))
            {
                iCount++;
            }
            iNo = iNo/10;
        }
        return iCount;
    }
}

class Assignment33_3
{
    public static void main(String arr[])throws IOException
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number:");
        int iValue = Integer.parseInt(bobj.readLine());

        Digits dobj = new Digits();
        int iRet = dobj.In_BetweenX(iValue);
        System.out.println("Numbers count between 3 to 7 is: "+iRet);

    }
}