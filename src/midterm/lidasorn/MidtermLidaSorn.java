package midterm.lidasorn;
import java.util.Scanner;
public class MidtermLidaSorn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String user = input.nextLine();
        countLettters(user);
    }//end of main
    public static void countLettters(String s){
        int[] a = new int[100];
        String newStr = "";
        for (int i = 0; i < s.length(); i++){
            if (newStr.indexOf(s.charAt(i)) != -1)
                 a[newStr.indexOf(s.charAt(i))]++;
            else if (newStr.indexOf(s.charAt(i)) == -1){
                newStr += s.charAt(i);
                a[newStr.indexOf(s.charAt(i))]++;
               
            }
        }
        for (int i = 0; i < newStr.length(); i++){
            System.out.println(newStr.charAt(i) + "  :  " + a[i]);
        
        }
        
    }//end of countLetters
}
