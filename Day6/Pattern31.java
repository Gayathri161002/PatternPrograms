public class Pattern31 
{
    static void printPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            int ch = 65 + i;
            for(int j=0;j<n;j++)
            {
                System.out.print((char)(ch+j) + " ");
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
A B C D E 
B C D E F 
C D E F G 
D E F G H 
E F G H I 

*/