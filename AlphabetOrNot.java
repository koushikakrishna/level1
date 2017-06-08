import java.util.Scanner;
public class AlphabetOrNot
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("THE LETTER IS AN ALPHABET"); 
        else
             System.out.println("NOT AN ALPHABET");
    }
}
