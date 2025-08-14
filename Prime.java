import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find whether it is prime or not:");
        int num = sc.nextInt();
        int count = 0;
        if(num ==1){
            System.out.println("1 is neither prime nor composite");
        }
        else if(num <1){
            System.out.println("Prime or composite are for only integers greater than 1");
        }
        else{
            for(int i = 2;i<num;i++){
                if(num % i == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.println("Given number is prime");
            }
            else{
                System.out.println("Given number is not prime");
            }
        }
       
    }
    
}
