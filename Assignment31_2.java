import java.util.Scanner;

class StringDemo
{
    public int Small_Count(String s)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt=0;iCnt<s.length();iCnt++)
        {
            if((s.charAt(iCnt)>='a')&&(s.charAt(iCnt)<='z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class Assignment31_2
{
    public static void main(String brr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sobj.nextLine();

        StringDemo dobj = new StringDemo();
        int iRet = dobj.Small_Count(s);

        System.out.println("Small letters in given string is: "+iRet);
    }
}