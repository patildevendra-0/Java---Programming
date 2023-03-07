import java.io.*;

class Digits
{
    public int Multiplication (int iNo)
    {
        int iMul = 1;
        int iDigit = 0;

        while(iNo!=0)
        {
            iDigit = iNo%10;
            if(iDigit == 0)
            {
                iDigit =1;
            }
            iMul = iMul*iDigit;
            iNo = iNo/10;
        }
        return iMul;
    }
}

class Assignment33_4
{
    public static void main(String arr[])throws IOException
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number:");
        int iValue = Integer.parseInt(bobj.readLine());

        Digits dobj = new Digits();
        int iRet = dobj.Multiplication(iValue);
        System.out.println("Multiplication of digits of given number is : "+iRet);

    }
}