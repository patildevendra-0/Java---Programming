import java.util.Scanner;

class Arithematic
{
    public int iValue1;
    public int iValue2;

    public Arithematic(int iNo1,int iNo2)
    {
        iValue1 = iNo1;
        iValue2 = iNo2;
    }

    public int Addition()
    {
        int iAns = iValue1+iValue2;
        return iAns;
    }

    public int Substraction()
    {
        int iAns = iValue1-iValue2;
        return iAns;
    }

    public int Multiplication()
    {
        int iAns = iValue1*iValue2;
        return iAns;
    }
    public int Division()
    {
        int iAns = iValue1/iValue2;
        return iAns;
    }
}

class pra1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int ino1 = sobj.nextInt();

        System.out.println("Enter the 2nd Number: ");
        int ino2 = sobj.nextInt();

        Arithematic aobj = new Arithematic(ino1,ino2);

        int iret = 0;

        iret = aobj.Addition();
        System.out.println("Addition is: "+iret);

        iret = aobj.Substraction();
        System.out.println("Subtracsion is: "+iret);

        iret = aobj.Multiplication();
        System.out.println("Multiplication is: "+iret);

        iret = aobj.Division();
        System.out.println("division is: "+iret);
    }

}