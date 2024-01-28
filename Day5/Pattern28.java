public class Pattern28
{
    public static void main(String args[]) 
    {
        for(char i='E';i>='A';i--)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
Output :
E E E E E 
D D D D D 
C C C C C 
B B B B B 
A A A A A 

*/