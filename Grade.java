import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks scored in subject1 for 100:");
        int sub1 = sc.nextInt();
        System.out.println("Enter marks scored in subject2 for 100:");
        int sub2 = sc.nextInt();
        System.out.println("Enter marks scored in subject3 for 100:");
        int sub3 = sc.nextInt();
        System.out.println("Enter marks scored in subject4 for 100:");
        int sub4 = sc.nextInt();
        System.out.println("Enter marks scored in subject5 for 100:");
        int sub5 = sc.nextInt();

        int total = sub1+sub2+sub3+sub4+sub5;
        double percent =  total*(100/500.0);
        char grade;
        System.out.println(percent);
        if(90<=percent && percent <=100){
             grade = 'S';

        }else if(80<=percent && percent <90){
            grade = 'A';
        }
        else if(70<=percent && percent <80){
            grade = 'B';
        }
        else if(60<=percent && percent <70){
            grade = 'C';
        }
        else {
            grade = 'F';
        }
        System.out.println(grade);

    }
    
}
