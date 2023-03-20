import java.util.*;

class Year
{
    public void CheckLeapYear(int Year)
    {
        if(Year%400==0)
        {
            System.out.println(Year+" is leap year");
        }
        else if(Year%100==0)
        {
            System.out.println(Year+" is not leap year");
        }
        else if(Year%4==0)
        {
            System.out.println(Year+" is leap year");
        }
        else
        {
            System.out.println(Year+" is not leap year");
        }
    }
    public void DisplayLeapYear(int year)
    {
        int iCnt = 0;
        for(iCnt=1800;iCnt<=year;iCnt++)
        {
            if(iCnt%400==0)
            {
                System.out.println("leap year: "+iCnt);
            }
            else if(iCnt%4==0)
            {
                System.out.println("leap year: "+iCnt);
            }
        }
    }
    public void Leap(int Start,int End)
    {
        int iCnt = 0;
        for(iCnt = Start;iCnt<=End;iCnt++)
        {
            if(iCnt%400==0)
            {
                System.out.println("leap year: "+iCnt);
            }
            else if(iCnt%4==0)
            {
                System.out.println("leap year: "+iCnt);
            }
        }
    }
}

class pra1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the YEAR: ");
        int iyear = sobj.nextInt();

        Year yobj = new Year();
        yobj.CheckLeapYear(iyear);

        yobj.DisplayLeapYear(iyear);


        System.out.println("Enter the start YEAR: ");
        int iStart = sobj.nextInt();
        System.out.println("Enter the end YEAR: ");
        int iEnd = sobj.nextInt();

        yobj.Leap(iStart,iEnd);   
    }
}