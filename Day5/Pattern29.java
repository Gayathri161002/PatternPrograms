public class Pattern29
{
    public static void main(String args[]) 
    {
        for(int i=0;i<5;i++)
        {
            for(char j='E';j>='A';j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
Output :
E D C B A 
E D C B A 
E D C B A 
E D C B A 
E D C B A 

*/