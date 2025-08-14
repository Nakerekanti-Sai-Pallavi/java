import java.util.Scanner;
public class Operators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
         System.out.println("Enter num2:");
        int num2 = sc.nextInt();
         System.out.println("choose one option 1.+  2.-  3.*  4./ 5.%");
        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            case 5:
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("choose among given options only:");
                break;
        }
    }
    
}
