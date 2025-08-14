public class Sum1_100 {
    public static void main(String[] args){
        int sum1 = 0;
        for(int i = 0;i<=100;i++){
            if(i%7!=0){
                sum1 = sum1 + i;
            }
        }   
        System.out.println(sum1);
    }

}
