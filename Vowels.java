import java.util.Scanner;
public class Vowels {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter sentence to count no of vowels and no of consonants:");
        String sent = sc.nextLine().toLowerCase();//remember for sentence with spaces nextLine()
        int countVowels = 0;
        int countConsonants = 0;
        for(char ch : sent.toCharArray() ){// for each means this
            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o'|| ch=='u'){
                countVowels++;

            }
            else{
                if(ch != ' '){
                    countConsonants++;

                }
                
            }
        }
        System.out.println("Number of vowels in a given sentence:"+countVowels);
        System.out.println("Number of Consonants in a given sentence:"+countConsonants);
   }
    
}
