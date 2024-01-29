public class Pattern40
{
    static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j*2 + " ");
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
2 4 
2 4 6 
2 4 6 8 
2 4 6 8 10 

*/