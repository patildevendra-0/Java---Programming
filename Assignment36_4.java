import java.util.Scanner;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int i = 0;
        int j = 0;
        int temp = iRow;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                System.out.print(temp+"\t");
            }
            temp--;
            System.out.println();
        
        }
    }
}

class Assignment36_4
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int i = sobj.nextInt();

        System.out.println("Enter the number of columns:");
        int j = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(i,j);

    }
}