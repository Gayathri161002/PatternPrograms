public class Pattern42
{
    static void printPattern(int n)
    {
        int val = 1;
        for(int i=1;i<=n;i++)
        {
            val = i;
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
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 

*/