public class Pattern12
{
    static void patternPrint(int n) 
    {
        for(int i=1;i<=n;i++)
        { 
            int val = i;
            for(int j=1;j<=n;j++)
            {
                System.out.print(val + " ");
                val += n;
                
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
1 6 11 16 21 
2 7 12 17 22 
3 8 13 18 23 
4 9 14 19 24 
5 10 15 20 25

*/