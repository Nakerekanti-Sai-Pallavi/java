import java.util.Scanner;
public class SumOfOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum1 = 0;
        for(int i =2 ;i<num;i++){
            if(i%2!=0){
                sum1 = sum1 + i;
            }
        }
        System.out.println(sum1);
    }    
}
