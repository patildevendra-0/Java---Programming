import java.util.Scanner;

class StringDemo
{
    public int Diff_Count(String s)
    {
        int iCnt = 0;
        int iCapCount = 0;
        int iSmaCount = 0;

        for(iCnt=0;iCnt<s.length();iCnt++)
        {
            if((s.charAt(iCnt)>='A')&&(s.charAt(iCnt)<='Z'))
            {
                iCapCount++;
            }
            else
            {
                iSmaCount++;
            }
        }
        if(iCapCount>iSmaCount)
        {
            return (iCapCount-iSmaCount);
        }
        else
        {
            return(iSmaCount-iCapCount);
        }
    }
}

class Assignment31_3
{
    public static void main(String brr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sobj.nextLine();

        StringDemo dobj = new StringDemo();
        int iRet = dobj.Diff_Count(s);

        System.out.println("The Diff between small and capital letter in given string is: "+iRet);
    }
}