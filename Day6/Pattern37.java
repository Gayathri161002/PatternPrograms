public class Pattern37
{
    static void printPattern(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(i + " ");
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
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1 

*/