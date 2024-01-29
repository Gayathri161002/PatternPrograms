public class Pattern39
{
    static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int val = n - i + 1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(val + " ");
                val++;
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
5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5 

*/