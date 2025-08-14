import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to fiind out whether it is an armstrong or not:");
        int n = sc.nextInt();
        int temp =n;
        int sum1 = 0;
        while(temp>0){
            int digit = temp % 10;
            int noOfDigits = String.valueOf(n).length();
            sum1 = sum1 + (int)Math.pow(digit,noOfDigits);
            System.out.println(sum1);
            temp = temp/ 10;

        }
        if(sum1 == n){
            System.out.println("Given number"+" "+n+ " "+"is an armstrong number");

        }
        else{
            System.out.println("Given number"+ " " +n+ " "+ "is not an armstrong number");
        }
    }
    
}
