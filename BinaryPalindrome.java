public class BinaryPalindrome {
    public static boolean palindromeCheck(int n){
        String s = Integer.toBinaryString(n);
        int i = 0;
        int j = (s.length())-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static int  greater(int n){
        int l = n;
        int counter = 0;
        do{
            l++;
            if(palindromeCheck(l)){
                counter++;
            }
        }while(counter == 0);
        return l;

     }

     public static void main(String[] args){
        int r = greater(9);
        System.out.println(r);
    }
}


