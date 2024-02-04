public class Pattern49 
{
    static void printPattern(int n)
    {
        int x = 1;
        int y,z;
        
        for(int i=n;i>0;i--)
        {
            y = i;
            z = x;
            for(int j=n;j>=i;j--)
            {
                System.out.print(z + " ");
                z -= y;
                y++;
            }
            x += i;
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int n = 5;
        printPattern(n);
    }
}

/*
Output :
1 
6 2 
10 7 3 
13 11 8 4 
15 14 12 9 5 

*/
