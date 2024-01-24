public class Pattern5
{
    static void patternPrint(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=5;j>=1;j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) 
    {
        int n = 5;
        patternPrint(n);
    }
}

/*
Output :
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 

*/