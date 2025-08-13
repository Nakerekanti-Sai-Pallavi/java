import java.util.*;
public class TypeCast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character:");
        char a = sc.nextLine().charAt(0);
        int num = (int)a;
        System.out.println(num);
    }
    
}
