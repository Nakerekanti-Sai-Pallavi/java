import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a palindrome or not:");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp >0){
            int digit = temp % 10;
            int numberOfDigits = String.valueOf(temp).length();
            rev = (int)(rev + digit * Math.pow(10,numberOfDigits-1));
            temp = temp / 10;
        }
        if(num == rev){
            System.out.println("The given number" + num + "is a palindrome");
        }
        else{
            System.out.println("The given number" + num + "is not a palindrome");
        }

    }    
}
