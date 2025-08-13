import java.util.Scanner;
public class DigitalRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find sum of digits until the sum is single digit:");
        int num = sc.nextInt();
        int sum1 = 0;
        while(num>0){
            sum1 = sum1 + (num % 10);
            if((1<=num && num <=9) && (sum1>9)){
                num = sum1;
                sum1 = 0;
                continue;
            }
            num = num / 10;
        }
        System.out.println(sum1);
    }
    
}
