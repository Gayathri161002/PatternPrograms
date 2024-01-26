public class Pattern16
{
    static void printPattern(int n)
    { 
        for(int i=1;i<=n;i++)
        {
            int val = i;
            for(int j=1;j<=n;j++)
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
1 2 3 4 5 
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9 

*/