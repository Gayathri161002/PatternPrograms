public class Pattern47
{
    static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int val = i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(val + " ");
                val += i;
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
2 4 
3 6 9 
4 8 12 16 
5 10 15 20 25 

*/