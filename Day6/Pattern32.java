public class Pattern32
{
    static void printPattern(int n)
    {
        for(char i='A';i<='E';i++)
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
A F K P U 
B G L Q V 
C H M R W 
D I N S X 
E J O T Y 

*/public class Patttern32
{
    static void printPattern(int n)
    {
        for(char i='A';i<='E';i++)
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
A F K P U 
B G L Q V 
C H M R W 
D I N S X 
E J O T Y 

*/