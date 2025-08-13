import java.util.Scanner;
public class Discount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total bill amount:");
        int totalAmount = sc.nextInt();
        if(totalAmount > 500){
            totalAmount = (int) (totalAmount- 0.1*(totalAmount));
        }
        System.out.println("Total bill amount is:"+totalAmount);
    }
    
}
