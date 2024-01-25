public class Pattern15
{
    static void printPattern(int n)
    {
        for(int i=n;i>=1;i--)
        {
            int val = i;
            for(int j=1;j<=n;j++)
            {
                System.out.print(val + " ");
                val += n;
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
5 10 15 20 25 
4 9 14 19 24 
3 8 13 18 23 
2 7 12 17 22 
1 6 11 16 21 

*/