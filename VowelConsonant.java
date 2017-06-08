import java.util.Scanner;
public class VowelConsonant
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.println("THE LETTER IS VOWEL");
        else
        {
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("THE LETTER IS CONSONANT"); 
        else
             System.out.println("NOT AN ALPHABET");
        }
    }
}
