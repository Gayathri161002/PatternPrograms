public class Pattern49 
{
    static void printPattern(int n)
    {
        int val = 1;
        int m = n;
        
        for(int i=n;i>=1;i--)
        {
            int val1 = val;
            int d = i;
            for(int j=n;j>=i;j--)
            {
                System.out.print(val1 + " ");
                val1 -= d;
                d++;
            }
            val += m;
            m--;
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
6 2 
10 7 3 
13 11 8 4 
15 14 12 9 5 

*/