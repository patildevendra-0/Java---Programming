import java.io.*;

class Digits
{
    public int Count_EvenDigit(int iNo)
    {
        int iCount = 0;
        int iDigit = 0;

        while(iNo!=0)
        {
            iDigit = iNo%10;
            if(iDigit%2!=0)
            {
                iCount++;
            }
            iNo = iNo/10;
        }
        return iCount;
    }
}

class Assignment33_2
{
    public static void main(String arr[])throws IOException
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number:");
        int iValue = Integer.parseInt(bobj.readLine());

        Digits dobj = new Digits();
        int iRet = dobj.Count_EvenDigit(iValue);
        System.out.println("No. of odd Digits in given Number are :"+iRet);
    }
}