public class Pattern20
{
    static void printPattern(int n)
    { 
        int val = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print((i+j)%2 + " ");
                }
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
1 0 1 0 1 
0 0 0 0 0 
1 0 1 0 1 
0 0 0 0 0 
1 0 1 0 1 

*/