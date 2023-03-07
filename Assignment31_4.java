import java.util.Scanner;

class StringDemo
{
    public boolean CheckVowels (String s)
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt=0;iCnt<s.length();iCnt++)
        {
            if((s.charAt(iCnt)=='a')||(s.charAt(iCnt)=='e')||(s.charAt(iCnt)=='i')||(s.charAt(iCnt)=='o')||(s.charAt(iCnt)=='u'))
            {
                bFlag = true;
                break;
            }
        }
        return bFlag;
    }
}

class Assignment31_4
{
    public static void main(String brr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sobj.nextLine();

        StringDemo dobj = new StringDemo();
        
        boolean bRet = false;
        bRet = dobj.CheckVowels(s);
        if(bRet==true)
        {
            System.out.println("Vowels are present in given String");
        }
        else
        {
            System.out.println("Vowels are not present in given string");
        }
    }    
}