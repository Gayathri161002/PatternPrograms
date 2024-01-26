public class Pattern18
{
    static void printPattern(int n)
    { 
        int val = 0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(val == 0)
                {
                    System.out.print(val + " ");
                    val = 1;
                }
                else
                {
                    System.out.print(val + " ");
                    val = 0;
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
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 

*/