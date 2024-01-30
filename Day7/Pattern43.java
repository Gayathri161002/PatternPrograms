public class Pattern43
{
    static void printPattern(int n)
    {
        int val = 1;
        for(int i=1;i<=n;i++)
        {
            int val2 = val;
            for(int j=1;j<=i;j++)
            {
                System.out.print(val2 + " ");
                val2+=2;
            }
            val+=2;
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
3 5 
5 7 9 
7 9 11 13 
9 11 13 15 17 

*/