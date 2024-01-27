public class Pattern21 
{
    static void printPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(((i+j)%2) + " ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) 
    {
        int n = 5;
        printPattern(n);
    }
}

/*
Output :
0 1 0 1 0 
0 0 0 0 0 
0 1 0 1 0 
0 0 0 0 0 
0 1 0 1 0 

*/