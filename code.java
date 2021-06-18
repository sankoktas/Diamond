/**This program draws diamonds
 * @author (Fikri San Koktas)
 * @version (19 February 2021) **/
import java.util.Scanner;
public class KFS_Diamond_Main
{
    public static void main(String[] args)
    {
        int n, i, j;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (i = 0; i <= n; i++) 
        {
            if (i % 2 != 0) 
            {
                for (j = 1; j <= (n - i)/2; j++) 
                {
                    System.out.print(" ");
                }
                for (j = 0; j < i; j++) 
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for (i = n - 1; i >= 1; i--) 
        {
            if (i % 2 != 0) 
            {
                for (j = 1; j <= (n - i)/2; j++) 
                {
                    System.out.print(" ");
                }
                for (j = 0; j < i; j++) 
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
