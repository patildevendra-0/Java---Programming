import java.util.Scanner;

class StringDemo
{
    public void Reverse_String(String s)
    {
        int iCnt = 0;
        char Brr[] = s.toCharArray();
        String Rev = "";

        for(iCnt=Brr.length-1;iCnt>=0;iCnt--)
        {
            Rev = Rev+Brr[iCnt];
        }
        System.out.println(Rev);
    }
}

class Assignment31_5
{
    public static void main(String brr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sobj.nextLine();

        StringDemo dobj = new StringDemo();
        dobj.Reverse_String(s);

        
    }
}