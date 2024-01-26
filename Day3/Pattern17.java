public class Pattern17
{
    static void printPattern(int n)
    { 
        for(int i=1;i<=n*2;i+=2)
        {
            int val = i;
            for(int j=1;j<=n;j++)
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
1 3 5 7 9 
3 5 7 9 11 
5 7 9 11 13 
7 9 11 13 15 
9 11 13 15 17 

*/