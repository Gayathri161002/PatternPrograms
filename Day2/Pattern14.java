public class Pattern14 
{
    static void printPattern(int n)
    {
        int dec = n * 2 - 1;
        int inc = 1;
        for(int i=n;i>=1;i--)
        {
            int val = i;
            for(int j=1;j<=n;j++)
            {
                if(j % 2 != 0)
                {
                    System.out.print(val + " "); 
                    val += inc;
                }
                else
                {
                    System.out.print(val + " ");
                    val += dec;
                }
            }
            inc += 2;
            dec -= 2;
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
5 6 15 16 25 
4 7 14 17 24 
3 8 13 18 23 
2 9 12 19 22 
1 10 11 20 21 

*/