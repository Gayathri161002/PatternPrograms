public class Pattern38
{
    static void printPattern(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j + " ");
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
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 

*/