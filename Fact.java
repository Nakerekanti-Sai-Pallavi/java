import java.util.*;
public class Fact {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial:");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = 2;i<=num;i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    
}
    
