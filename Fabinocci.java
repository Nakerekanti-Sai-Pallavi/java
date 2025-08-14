import java.util.*;
public class Fabinocci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int i = 3;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(i<=n){
           
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
            i++;
        }
        

    }
}