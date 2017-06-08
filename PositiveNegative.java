import java.util.Scanner;
public class PositiveNegative
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a==0)
        {
            System.out.println("ZERO");
        }
        if(a>0)
        {
           System.out.println("POSITIVE");  
        }
        if(a<0)
        {
            System.out.println("NEGATIVE"); 
        }
    }
}
