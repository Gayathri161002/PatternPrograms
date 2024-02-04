public class Pattern46 
{
    static void printPattern(int n)
    {
        int val = 2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(val + " ");
                val += 2;
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
2 
4 6 
8 10 12 
14 16 18 20 
22 24 26 28 30 

*/