import java.util.Scanner;

class StringDemo
{
    public int Capital_Count(String s)
    {
        int iCnt = 0;
        char Arr[] = s.toCharArray();
        int iCount = 0;

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if((Arr[iCnt]>='A')&&(Arr[iCnt]<='Z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class Assignment31_1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
    
        System.out.println("Enter the string:");
        String s = sobj.nextLine();

        StringDemo dobj = new StringDemo();

        int iRet = dobj.Capital_Count(s);
        System.out.println("Capital letters in given string is: "+iRet);
    }

}