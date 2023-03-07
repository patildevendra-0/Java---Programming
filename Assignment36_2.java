import java.util.Scanner;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int i = 0;
        int j = 0;
        char ch = 'A';
        char temp = ch;
        char ch1 = 'a';
        char temp1 = ch1;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(i%2!=0)
                {
                    System.out.print(ch+"\t");
                    ch++;
                }
                else
                {
                    System.out.print(ch1+"\t");
                    ch1++;
                }
            }
            ch = temp;
            ch1 = temp1;
           
            System.out.println();
        
        }
    }
}

class Assignment36_2
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