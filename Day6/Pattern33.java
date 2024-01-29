public class Pattern33
{
    static void printPattern(int n)
    {
        for(char i='E';i>='A';i--)
        {
            char ch = i;
            for(int j=0;j<n;j++)
            {
                System.out.print(ch + " ");
                ch+=5;
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
E J O T Y 
D I N S X 
C H M R W 
B G L Q V 
A F K P U 

*/