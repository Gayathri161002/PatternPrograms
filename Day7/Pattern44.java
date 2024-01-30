public class Pattern44
{
    static void printPattern(int n)
    {
        int val = 1;
        for(int i=1;i<n;i++)
        {
            int val2 = val;
            for(int j=1;j<=i;j++)
            {
                System.out.print(val2 + " ");
                val2--;
            }
            val = val+i+1;
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
3 2 
6 5 4 
10 9 8 7 

*/